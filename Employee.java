package se.iths.StaffManagement;

public abstract class Employee{

    private int id;
    private String name;
    private double experience;
    private double salery;
    private String designation;
    static int idCounter = 0;


    public Employee(String name, double experience, double salery, String designation) {
        //super();
        this.name = name;
        this.experience = experience;
        this.salery = salery;
        this.designation = designation;
        this.id = idCounter;
        idCounter++;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public double getSalery() {
        return salery;
    }

    public void setSalery(double salery) {
        this.salery = salery;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }



    @Override
    public String toString() {
        return "Employee{" + "ID=" + id + ", name=" + name + ", experience=" + experience + ", salery=" + salery + ", department=" + designation + '}';
    }

    public abstract void calculateBonusOfEmployee();

}
