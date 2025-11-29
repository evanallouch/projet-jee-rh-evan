package controller;

import java.io.IOException;

import dao.EmployeDao;
import dao.EmployeDaoMemoire;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Employe;

@WebServlet("/edit-employe")
public class EditEmployeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private EmployeDao employeDao = new EmployeDaoMemoire();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String idStr = request.getParameter("id");
        if (idStr != null && !idStr.isBlank()) {
            try {
                int id = Integer.parseInt(idStr);
                Employe e = employeDao.findById(id);
                request.setAttribute("employe", e);
            } catch (NumberFormatException e) {
                // ignore pour cette version simple
            }
        }

        request.getRequestDispatcher("/editEmploye.jsp").forward(request, response);
    }
}
