package com.example.dao;

import com.example.simpleboard.dao.MyBatisUtil;
import com.example.simpleboard.dto.BoardDTO;
import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

@Log4j2
public class MyBatisTests {
    @Test
    public void selectAllTest(){
        SqlSession session
                = MyBatisUtil.INSTANCE.getSqlSessionFactory().openSession(true);

        List<BoardDTO> list= session.selectList("com.example.simpleboard.dao.BoardMapper.selectAll");

        list.forEach(boardDTO -> log.info(boardDTO));
    }

    @Test
    public void selectOne(){
        SqlSession session = MyBatisUtil.INSTANCE.getSqlSessionFactory().openSession(true);

        BoardDTO dto = BoardDTO.builder().tno(3).build();

        dto = session.selectOne("com.example.simpleboard.dao.BoardMapper.selectOne", dto);

        log.info(dto);
    }

    @Test
    public void insert(){
        SqlSession session
                = MyBatisUtil.INSTANCE.getSqlSessionFactory().openSession(true);

        BoardDTO dto = BoardDTO.builder().title("TestTitle").memo("Memo").build();

        session.insert("com.example.simpleboard.dao.BoardMapper.insert",dto);
    }
}
