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

@WebServlet("/ajout-employe")
public class AjoutEmployeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private EmployeDao employeDao = new EmployeDaoMemoire();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Récupération des paramètres envoyés par le formulaire
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String poste = request.getParameter("poste");
        String salaireStr = request.getParameter("salaireBase");

        double salaireBase = 0;
        if (salaireStr != null && !salaireStr.isBlank()) {
            try {
                salaireBase = Double.parseDouble(salaireStr);
            } catch (NumberFormatException e) {
                salaireBase = 0;
            }
        }

        // On crée un Employe (l'id sera mis par le DAO)
        Employe nouvelEmploye = new Employe(0, nom, prenom, poste, salaireBase);

        // On l'ajoute via le DAO
        employeDao.add(nouvelEmploye);

        // On revient à la liste des employés
        response.sendRedirect(request.getContextPath() + "/employes");
    }
}
