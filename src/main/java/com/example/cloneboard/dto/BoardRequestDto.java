package com.example.cloneboard.dto;

import com.example.cloneboard.entity.BoardEntity;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class BoardRequestDto {
    private String title;
    private String nickname;
    private String content;

    public BoardEntity toEntity() {
        return BoardEntity.builder()
                .title(title)
                .nickname(nickname)
                .content(content)
                .build();
    }
}
