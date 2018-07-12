package models;

import sun.jvm.hotspot.memory.Generation;

import javax.persistence.*;


@Entity
@Table(name="employees")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Employee {
    private int id;
    private String name;
    private int ni;
    private int salary;

    public Employee() {

    }

    public Employee(String name, int ni, int salary) {
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "ni")
    public int getNi() {
        return ni;
    }

    public void setNi(int ni) {
        this.ni = ni;
    }


    @Column(name = "salary")
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

