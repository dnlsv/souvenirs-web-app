package servlets;

import database.AddToDatabase;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddSouvenirServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String name = request.getParameter("nameOfSouvenir");
        String details = request.getParameter("producerDetails");
        String date = request.getParameter("releaseDate");
        String price = request.getParameter("price");

        AddToDatabase add = new AddToDatabase();
        add.AddSouvenirToDatabase(name, details, date, price);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("addSouvenir.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("addSouvenir.jsp");
        requestDispatcher.forward(request, response);
    }

}
