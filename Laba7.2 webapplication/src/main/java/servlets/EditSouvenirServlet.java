package servlets;

import database.EditFromDatabase;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditSouvenirServlet extends HttpServlet {

    @Override    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        int id = Integer.parseInt((request.getParameter("id")));
        String name = request.getParameter("name");
        String details = request.getParameter("details");
        String date = request.getParameter("date");
        int price = Integer.parseInt(request.getParameter("price"));
        EditFromDatabase edit = new EditFromDatabase();
        edit.EditSouvenirToDatabase(id, name, details, date, price);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("editSouvenir.jsp");
        requestDispatcher.forward(request, response);
    }

    /*@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("editSouvenir.jsp");
        requestDispatcher.forward(request, response);
    }*/
}
