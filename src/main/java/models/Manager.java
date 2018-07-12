package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="managers")
public class Manager extends Employee {
    private int budget;
    private Department department;
    private List<Administrator> administrators;

    public Manager(){}

    public Manager(String name, String ni, int salary, int budget, Department department) {
        super(name, ni, salary);
        this.budget = budget;
        this.department = department;
        this.administrators = new ArrayList<Administrator>();
    }

    @Column(name="budget")
    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="department_id", nullable = false)
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    @OneToMany(mappedBy ="manager", fetch = FetchType.LAZY)
    public List<Administrator> getAdministrators() {
        return administrators;
    }

    public void setAdministrators(List<Administrator> administrators) {
        this.administrators = administrators;
    }
}
