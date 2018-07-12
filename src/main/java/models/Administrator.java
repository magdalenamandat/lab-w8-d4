package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "administrators")
public class Administrator extends Employee {
    private Manager manager;

    public Administrator(String name, String ni, int salary, Manager manager) {
        super(name, ni, salary);
        this.manager = manager;
    }

    public Administrator(){}

    @Column(name="manager")
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
