package servlets;

import database.ViewFromDatabase;
import models.Producer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class ViewProducersServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ViewFromDatabase view = new ViewFromDatabase();
        view.ViewProducersFromDatabase();
        ArrayList<Producer> producers = view.getProducerArrayList();

        request.setAttribute("producers", producers);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("viewProducers.jsp");
        requestDispatcher.forward(request, response);
    }
}