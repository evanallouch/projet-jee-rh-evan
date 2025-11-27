package controller;

import java.io.IOException;

import dao.EmployeDao;
import dao.EmployeDaoMemoire;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/supprimer-employe")
public class SupprimerEmployeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private EmployeDao employeDao = new EmployeDaoMemoire();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String idStr = request.getParameter("id");
        if (idStr != null && !idStr.isBlank()) {
            try {
                int id = Integer.parseInt(idStr);
                employeDao.deleteById(id);
            } catch (NumberFormatException e) {
                // on ignore, pas grave pour notre version simple
            }
        }

        // on revient sur la liste
        response.sendRedirect(request.getContextPath() + "/employes");
    }
}
