package servlets;

import database.SearchFromDatabase;
import models.Producer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class ProducersNameAndDateServlet extends HttpServlet {

    private String name;
    private String date;

    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        name = request.getParameter("name");
        date = request.getParameter("date");

        doGet(request, response);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("producersNameAndDate.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SearchFromDatabase search = new SearchFromDatabase();
        HashSet<Integer> arrayDetails = search.SearchNameAndDateFromDatabase(name, date);
        search.SearchProducersFromDatabase(arrayDetails);
        ArrayList<Producer> producers = search.getProducerArrayList();
        request.setAttribute("producers", producers);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("producersNameAndDate.jsp");
        requestDispatcher.forward(request, response);
    }
}
