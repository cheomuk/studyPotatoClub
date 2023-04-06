package com.example.cloneboard.repository;

import com.example.cloneboard.dto.BoardResponseDto;
import com.example.cloneboard.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
    BoardEntity findByNickname(String nickname);
//    BoardResponseDto findByNickname(String nickname);
}
