package com.study.board.controller;

import ch.qos.logback.core.model.Model;
import com.study.board.service.CommentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/comments")
public class CommentController {
    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    // 댓글 추가 API (성공 여부 반환)
    @PostMapping
    public Map<String, Object> addComment(@RequestBody Map<String, Object> comment) {
        boolean success = commentService.addComment(comment);
        return Map.of("success", success);
    }

    // 특정 게시글의 댓글 목록 조회 API
    @GetMapping("/{postId}")
    public List<Map<String, Object>> getComments(@PathVariable Long postId) {
        return commentService.getComments(postId);
    }

    // 댓글 삭제
    @DeleteMapping("/{commentId}")
    public Map<String, Object> deleteComment(@PathVariable Long commentId, @RequestBody Map<String, Object> payload) {
        boolean success = commentService.deleteComment(commentId, (String) payload.get("comment_password"));
        return Map.of("success", success);
    }

    // 댓글 수정
    @PutMapping("/{commentId}")
    public Map<String, Object> updateComment(@PathVariable Long commentId, @RequestBody Map<String, Object> payload) {
        boolean success = commentService.updateComment(commentId, (String) payload.get("comment_password"), (String) payload.get("commentContent"));
        return Map.of("success", success);
    }
}