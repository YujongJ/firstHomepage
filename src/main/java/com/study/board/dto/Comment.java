package com.study.board.dto;

import java.security.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class Comment {
    private Long commentId;        // 댓글 ID
    private Long postId;           // 댓글이 속한 게시글 ID
    private String commentContent; // 댓글 내용
    private Timestamp commentCreatedAt; // 댓글 작성 시간
    private String comment_writer;

}

