package dao;

import java.util.List;
import model.Employe;

public interface EmployeDao {
    List<Employe> findAll();
    void add(Employe employe);
    void deleteById(int id);  
}
