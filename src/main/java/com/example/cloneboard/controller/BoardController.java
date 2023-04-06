package com.example.cloneboard.controller;

import com.example.cloneboard.dto.BoardDeleteDto;
import com.example.cloneboard.dto.BoardRequestDto;
import com.example.cloneboard.dto.BoardResponseDto;
import com.example.cloneboard.entity.BoardEntity;
import com.example.cloneboard.repository.BoardRepository;
import com.example.cloneboard.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;
    private final BoardRepository boardRepository;

    @PostMapping("/")
    public ResponseEntity<String> createBoard(@RequestBody BoardRequestDto boardRequestDto) {
        boardService.createBoard(boardRequestDto);
        return ResponseEntity.ok("게시글이 등록되었습니다.");
    }

    @GetMapping("/")
    public List<BoardEntity> viewBoardList() {
        return boardService.viewBoardList();
    }

    @GetMapping("/board")
    public BoardResponseDto viewBoard(@RequestParam String nickname) {
        return boardService.viewBoard(nickname);
    }

    @PutMapping("/")
    public ResponseEntity<String> updateBoard(@RequestBody BoardRequestDto boardRequestDto) {
        boardService.updateBoard(boardRequestDto);
        return ResponseEntity.ok("게시글이 수정되었습니다.");
    }

    @DeleteMapping("/")
    public ResponseEntity<String> deletedBoard(@RequestBody BoardDeleteDto dto) {
        boardService.deletedBoard(dto);
        return ResponseEntity.ok("게시글이 삭제되었습니다.");
    }
}
