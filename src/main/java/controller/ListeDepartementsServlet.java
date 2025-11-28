package controller;

import java.io.IOException;
import java.util.List;

import dao.DepartementDao;
import dao.DepartementDaoMemoire;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Departement;

@WebServlet("/departements")
public class ListeDepartementsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private DepartementDao departementDao = new DepartementDaoMemoire();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Departement> liste = departementDao.findAll();
        request.setAttribute("listeDepartements", liste);

        request.getRequestDispatcher("/listeDepartements.jsp").forward(request, response);
    }
}
