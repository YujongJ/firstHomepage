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
    private Long commentId;        // 댓글 ID
    private Long postId;           // 댓글이 속한 게시글 ID
    private String commentContent;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")// 댓글 내용
    private LocalDateTime commentCreatedAt; // 댓글 작성 시간
    private String comment_writer;
    private String comment_password;
}

