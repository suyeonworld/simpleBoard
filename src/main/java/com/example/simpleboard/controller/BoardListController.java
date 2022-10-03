package com.example.simpleboard.controller;

import com.example.simpleboard.dao.BoardDAO;
import com.example.simpleboard.dao.MyBatisUtil;
import com.example.simpleboard.dto.BoardDTO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet (name = "BoardListController", value = "/board/list")
public class BoardListController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        List<BoardDTO> list = BoardDAO.INSTANCE.selectAll();

        request.setAttribute("list", list);

        request.getRequestDispatcher("/WEB-INF/views/board/list.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //request.getRequestDispatcher("/board/add").forward(request, response);
        //response.sendRedirect("/board/add");
    }
}
