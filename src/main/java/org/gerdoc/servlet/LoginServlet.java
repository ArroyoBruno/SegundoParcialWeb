package org.gerdoc.servlet;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws IOException {

        request.setCharacterEncoding("UTF-8");

        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println(
                "<h2>Datos recibidos correctamente</h2>"
        );
        response.getWriter().println(
                "<p>Usuario: " + usuario + "</p>"
        );
    }
}
