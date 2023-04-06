package com.example.cloneboard.service;

import com.example.cloneboard.dto.BoardRequestDto;
import com.example.cloneboard.dto.BoardResponseDto;
import com.example.cloneboard.entity.BoardEntity;
import com.example.cloneboard.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class BoardService {

    private final BoardRepository boardRepository;

    public void createBoard(BoardRequestDto boardRequestDto) {
        BoardEntity boardEntity = boardRequestDto.toEntity();
        boardRepository.save(boardEntity);
    }

    public BoardResponseDto viewBoardList() {

    }
}
