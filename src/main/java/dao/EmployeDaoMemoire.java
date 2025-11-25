package dao;

import java.util.ArrayList;
import java.util.List;

import model.Employe;

public class EmployeDaoMemoire implements EmployeDao {

    private static List<Employe> employes = new ArrayList<>();

    static {
        employes.add(new Employe(1, "Dupont", "Jean", "Développeur", 2500));
        employes.add(new Employe(2, "Martin", "Sophie", "Chef de projet", 3200));
        employes.add(new Employe(3, "Durand", "Paul", "RH", 2800));
    }

    @Override
    public List<Employe> findAll() {
        return employes;
    }
}
