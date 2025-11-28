package dao;

import java.util.ArrayList;
import java.util.List;

import model.Employe;
import model.FichePaie;

public class FichePaieDaoMemoire implements FichePaieDao {

    private static List<FichePaie> fiches = new ArrayList<>();

    static {
        Employe e1 = new Employe(1, "Dupont", "Jean", "Développeur", 2500, "Informatique");
        Employe e2 = new Employe(2, "Martin", "Sophie", "Chef de projet", 3200, "Informatique");

        fiches.add(new FichePaie(1, e1, "2024-10", 2500, 200, 150));
        fiches.add(new FichePaie(2, e2, "2024-10", 3200, 300, 200));
    }

    @Override
    public List<FichePaie> findAll() {
        return fiches;
    }
}
