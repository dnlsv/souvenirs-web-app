package servlets;

import database.SearchFromDatabase;
import models.Souvenir;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class SouvenirsProducerServlet extends HttpServlet {

    private String name;

    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        name = request.getParameter("nameOfProducer");

        doGet(request, response);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("souvenirsProducer.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SearchFromDatabase search = new SearchFromDatabase();
        ArrayList<Integer> arrayId = search.SearchProducerNameFromDatabase(name);
        search.SearchSouvenirsFromDatabase(arrayId);
        ArrayList<Souvenir> souvenirs = search.getSouvenirArrayList();
        request.setAttribute("souvenirs", souvenirs);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("souvenirsProducer.jsp");
        requestDispatcher.forward(request, response);
    }
}
