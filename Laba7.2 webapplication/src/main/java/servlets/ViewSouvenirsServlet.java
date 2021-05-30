package servlets;

import database.ViewFromDatabase;
import models.Souvenir;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class ViewSouvenirsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ViewFromDatabase view = new ViewFromDatabase();
        view.ViewSouvenirsFromDatabase();
        ArrayList<Souvenir> souvenirs = view.getSouvenirArrayList();

        request.setAttribute("souvenirs", souvenirs);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("viewSouvenirs.jsp");
        requestDispatcher.forward(request, response);
    }
}