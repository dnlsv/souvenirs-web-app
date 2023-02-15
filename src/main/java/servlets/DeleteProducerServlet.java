package servlets;

import database.DeleteFromDatabase;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteProducerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("del");
        if(action != null) {
            int id = Integer.parseInt(request.getParameter("id"));
            DeleteFromDatabase delete = new DeleteFromDatabase();
            delete.DeleteProducerToDatabase(id);
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("deleteProducer.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("deleteProducer.jsp");
        requestDispatcher.forward(request, response);

    }

}

