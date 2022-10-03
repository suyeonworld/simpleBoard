package com.example.simpleboard.controller;

import com.example.simpleboard.dao.BoardDAO;
import com.example.simpleboard.dao.MyBatisUtil;
import com.example.simpleboard.dto.BoardDTO;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@Log4j2
@WebServlet(name = "BoardAddController", value = "/board/add")
public class BoardAddController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/views/board/add.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String memo = request.getParameter("memo");

//        BoardDTO dto = BoardDTO.builder()
//                .title(title)
//                .memo(memo)
//                .build();
//
//        @Cleanup SqlSession session = MyBatisUtil.INSTANCE.getSqlSessionFactory().openSession(true);
//
//        session.insert("com.example.simpleboard.dao.BoardMapper.insert", dto);

        BoardDTO dto = BoardDAO.INSTANCE.insert(title, memo);

        response.sendRedirect("/board/list");
    }
}
