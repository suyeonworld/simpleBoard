package com.example.simpleboard.controller;

import com.example.simpleboard.dao.BoardDAO;
import com.example.simpleboard.dto.BoardDTO;
import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@Log4j2
@WebServlet(name = "BoardDetailController", value = "/board/detail")
public class BoardDetailController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        int tno = Integer.parseInt(request.getParameter("tno"));

        BoardDTO dto = BoardDAO.INSTANCE.selectOne(tno);

        request.setAttribute("dto", dto);

        request.getRequestDispatcher("/WEB-INF/views/board/detail.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
