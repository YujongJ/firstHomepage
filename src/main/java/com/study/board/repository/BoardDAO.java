package com.study.board.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;

@Repository
public class BoardDAO {
    private final SqlSession sqlSession;

    public BoardDAO(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    // 댓글 추가
    public void insertComment(Map<String, Object> comment) {
        sqlSession.insert("Board.insertComment", comment);
    }

    // 특정 게시글의 댓글 목록 조회
    public List<Map<String, Object>> getCommentsByPostId(Long postId) {
        return sqlSession.selectList("Board.getCommentsByPostId", postId);
    }
}
