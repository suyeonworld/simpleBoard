package com.example.simpleboard.dao;

import com.example.simpleboard.dto.BoardDTO;
import lombok.Cleanup;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public enum BoardDAO {

    INSTANCE;

    public List<BoardDTO> selectAll(){
        @Cleanup SqlSession session
                = MyBatisUtil.INSTANCE.getSqlSessionFactory().openSession(true);

        List<BoardDTO> list = session.selectList("com.example.simpleboard.dao.BoardMapper.selectAll");

        return list;
    }

    public BoardDTO insert(String title, String memo){
        BoardDTO dto = BoardDTO.builder()
                .title(title)
                .memo(memo)
                .build();

        @Cleanup SqlSession session
                = MyBatisUtil.INSTANCE.getSqlSessionFactory().openSession(true);

        session.insert("com.example.simpleboard.dao.BoardMapper.insert", dto);

        return dto;
    }

}
