package dao;

import java.util.List;

import model.Employe;

public interface EmployeDao {
    List<Employe> findAll();
    Employe findById(int id);    
    void add(Employe employe);
    void deleteById(int id);
}
