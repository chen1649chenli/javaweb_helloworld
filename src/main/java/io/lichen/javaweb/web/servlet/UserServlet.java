package io.lichen.javaweb.web.servlet;

import io.lichen.javaweb.domain.User;
import io.lichen.javaweb.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        UserService userService = new UserService();
        User user = userService.find();

        request.setAttribute("user", user);
        request.getRequestDispatcher("/show.jsp").forward(request, response);
    }
}
