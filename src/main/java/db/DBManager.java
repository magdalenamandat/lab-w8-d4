package db;

import models.Administrator;
import models.Department;
import models.Manager;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBManager {

    private static Session session;

    public static List<Administrator> getAdministratorForManager(Manager manager) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Administrator> results = null;
        try {
            Criteria cr = session.createCriteria(Administrator.class);
            cr.add(Restrictions.eq("manager", manager));
            results =  cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

    public static Manager getManagerForDepartment(Department department) {
        session = HibernateUtil.getSessionFactory().openSession();
        Manager result = null;
        try {
            Criteria cr = session.createCriteria(Manager.class);
            cr.add(Restrictions.eq("department", department));
            result = (Manager) cr.uniqueResult();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return result;

    }
}
