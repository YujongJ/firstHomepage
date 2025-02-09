package com.study.board.dto;

import java.security.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class Comment {
    private Long commentId;
    private Long postId;
    private String commentContent;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")// Json 리스트 사용 시 날짜 시간 포멧 변경(미구현)
    private LocalDateTime commentCreatedAt;

    private String comment_writer;
    private String comment_password;
}

