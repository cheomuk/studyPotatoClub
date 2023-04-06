package com.example.cloneboard.service;

import com.example.cloneboard.dto.BoardDeleteDto;
import com.example.cloneboard.dto.BoardRequestDto;
import com.example.cloneboard.dto.BoardResponseDto;
import com.example.cloneboard.entity.BoardEntity;
import com.example.cloneboard.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class BoardService {

    private final BoardRepository boardRepository;

    public void createBoard(BoardRequestDto boardRequestDto) {
        BoardEntity boardEntity = boardRequestDto.toEntity();
        boardRepository.save(boardEntity);
    }

    public List<BoardEntity> viewBoardList() {
        List<BoardEntity> list = boardRepository.findAll();
        return list;
    }

    public BoardResponseDto viewBoard(String nickname) {
        BoardEntity boardEntity = boardRepository.findByNickname(nickname);
        BoardResponseDto boardResponseDto = BoardResponseDto.builder()
                .title(boardEntity.getTitle())
                .nickname(boardEntity.getNickname())
                .content(boardEntity.getContent())
                .build();

        return boardResponseDto;
    }

    public void updateBoard(BoardRequestDto boardRequestDto) {
        BoardEntity boardEntity = boardRepository.findByNickname(boardRequestDto.getNickname());
        boardEntity.update(boardRequestDto);
        boardRepository.save(boardEntity);
    }

    public void deletedBoard(BoardDeleteDto dto) {
        BoardEntity boardEntity = boardRepository.findByNickname(dto.getNickname());
        boardRepository.delete(boardEntity);
    }
}
