package controller;

import java.io.IOException;
import java.util.List;

import dao.FichePaieDao;
import dao.FichePaieDaoMemoire;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.FichePaie;

@WebServlet("/fiches-paie")
public class ListeFichesPaieServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private FichePaieDao fichePaieDao = new FichePaieDaoMemoire();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<FichePaie> liste = fichePaieDao.findAll();
        request.setAttribute("listeFichesPaie", liste);

        request.getRequestDispatcher("/listeFichesPaie.jsp").forward(request, response);
    }
}
