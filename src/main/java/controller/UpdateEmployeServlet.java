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

@WebServlet("/update-employe")
public class UpdateEmployeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private EmployeDao employeDao = new EmployeDaoMemoire();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String idStr = request.getParameter("id");
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String poste = request.getParameter("poste");
        String salaireStr = request.getParameter("salaireBase");
        String departement = request.getParameter("departement");

        if (idStr != null && !idStr.isBlank()) {
            try {
                int id = Integer.parseInt(idStr);
                Employe e = employeDao.findById(id);
                if (e != null) {
                    double salaireBase = 0;
                    try {
                        salaireBase = Double.parseDouble(salaireStr);
                    } catch (NumberFormatException ex) {
                        salaireBase = e.getSalaireBase();
                    }

                    // on met à jour le même objet en mémoire
                    e = new Employe(id, nom, prenom, poste, salaireBase, departement);
                    // petite astuce : on supprime puis on ré-ajoute
                    employeDao.deleteById(id);
                    employeDao.add(e);
                }
            } catch (NumberFormatException ex) {
                // ignore
            }
        }

        response.sendRedirect(request.getContextPath() + "/employes");
    }
}
