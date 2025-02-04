package com.study.board.service;

import com.study.board.repository.BoardDAO;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class CommentService {
    private final BoardDAO boardDAO;

    public CommentService(BoardDAO boardDAO) {
        this.boardDAO = boardDAO;
    }

    // ✅ 댓글 추가 (성공 시 true, 실패 시 false 반환)
    public boolean addComment(Map<String, Object> comment) {
        try {
            boardDAO.insertComment(comment);
            return true; // 성공
        } catch (Exception e) {
            return false; // 실패
        }
    }

    // ✅ 특정 게시글의 댓글 조회
    public List<Map<String, Object>> getComments(Long postId) {
        List<Map<String, Object>> comments = boardDAO.getCommentsByPostId(postId);
        return (comments != null) ? comments : List.of(); // null 방지
    }
}