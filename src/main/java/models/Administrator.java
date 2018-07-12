package models;

import javax.persistence.*;

@Entity
@Table(name = "administrators")
public class Administrator extends Employee {
    private Manager manager;

    public Administrator(String name, String ni, int salary, Manager manager) {
        super(name, ni, salary);
        this.manager = manager;
    }

    public Administrator(){}

    @ManyToOne
            @JoinColumn(name="manager_id", nullable=false)
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
