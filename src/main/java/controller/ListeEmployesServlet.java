package controller;

import java.io.IOException;
import java.util.List;

import dao.EmployeDao;
import dao.EmployeDaoMemoire;
import model.Employe;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({"/ListeEmployesServlet", "/employes"})
public class ListeEmployesServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // notre "accès aux données" en mémoire
    private EmployeDao employeDao = new EmployeDaoMemoire();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // récupérer la liste des employés
        List<Employe> liste = employeDao.findAll();

        // mettre la liste dans la requête pour la JSP
        request.setAttribute("listeEmployes", liste);

        // déléguer l'affichage à la JSP
        request.getRequestDispatcher("/listeEmployes.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // pour l'instant, on redirige tout sur le GET
        doGet(request, response);
    }
}
