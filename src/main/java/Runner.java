import db.DBHelper;
import db.DBManager;
import models.Administrator;
import models.Department;
import models.Manager;

import java.util.List;

public class Runner {
    public static void main(String[] args) {


        Department department = new Department("IT");
        DBHelper.save(department);

        Manager manager = new Manager("Anna", "ND12345", 30000, 400000, department);
        DBHelper.save(manager);

        Administrator administrator1 = new Administrator("Edward", "BN234567", 20000, manager);
        DBHelper.save(administrator1);

        Administrator administrator2 = new Administrator("Lucy", "BN23739", 22000, manager);
        DBHelper.save(administrator2);

        List<Administrator> administratorList = DBManager.getAdministratorForManager(manager);

        Manager foundManager = DBManager.getManagerForDepartment(department);
    }
}
