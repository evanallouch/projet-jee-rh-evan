package dao;

import java.util.ArrayList;
import java.util.List;

import model.Departement;

public class DepartementDaoMemoire implements DepartementDao {

    private static List<Departement> departements = new ArrayList<>();

    static {
        departements.add(new Departement(1, "Informatique"));
        departements.add(new Departement(2, "Ressources Humaines"));
        departements.add(new Departement(3, "Finance"));
    }

    @Override
    public List<Departement> findAll() {
        return departements;
    }
}
