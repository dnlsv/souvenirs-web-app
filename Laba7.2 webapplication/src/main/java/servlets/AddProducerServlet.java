package servlets;

import database.AddToDatabase;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddProducerServlet extends HttpServlet {

    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String name = request.getParameter("nameOfProducer");
        String country = request.getParameter("Country");

        AddToDatabase add = new AddToDatabase();
        add.AddProducerToDatabase(name, country);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("addProducer.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("addProducer.jsp");
        requestDispatcher.forward(request, response);
    }

}
