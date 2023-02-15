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

public class ProducersPriceServlet extends HttpServlet {

    private int price;

    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        price = Integer.parseInt(request.getParameter("price"));

        doGet(request, response);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("producersPrice.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SearchFromDatabase search = new SearchFromDatabase();
        HashSet<Integer> arrayDetails = search.SearchPriceFromDatabase(price);
        search.SearchProducersFromDatabase(arrayDetails);
        ArrayList<Producer> producers = search.getProducerArrayList();
        request.setAttribute("producers", producers);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("producersPrice.jsp");
        requestDispatcher.forward(request, response);
    }
}
