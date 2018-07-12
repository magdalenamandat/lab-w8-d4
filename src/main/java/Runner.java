import db.DBHelper;
import models.Administrator;
import models.Employee;
import models.Manager;

public class Runner {
    public static void main(String[] args) {


        Manager manager = new Manager("Anna", "ND12345", 30000, 400000, "IT");
        DBHelper.save(manager);


        Administrator administrator1 = new Administrator("Edward", "BN234567", 20000, manager);
        DBHelper.save(administrator1);

        Administrator administrator2 = new Administrator("Lucy", "BN23739", 22000, manager);
        DBHelper.save(administrator2);
    }
}
