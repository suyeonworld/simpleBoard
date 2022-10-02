package com.example.simpleboard.dao;

import com.example.simpleboard.dto.BoardDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public enum BoardDAO {

    INSTANCE;

    public List<BoardDTO> selectAll(){
        SqlSession session = MyBatisUtil.INSTANCE.getSqlSessionFactory().openSession(true);

        List<BoardDTO> list = session.selectList("com.example.simpleboard.dao.BoardMapper.selectAll");

        return list;
    }
}
