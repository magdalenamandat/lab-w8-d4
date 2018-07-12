package models;

import javax.persistence.*;

@Entity
@Table(name = "departments")
public class Department {
    private int id;
    private String title;
    private Manager manager;

    public Department() {
    }

    public Department(int id, String title, Manager manager) {
        this.id = id;
        this.title = title;
        this.manager = manager;
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

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "manager")
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
