package com.example.cloneboard.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Builder
public class BoardResponseDto {
    private String title;
    private String nickname;
    private String content;
}
