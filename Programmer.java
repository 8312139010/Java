package se.iths.StaffManagement;

public class Programmer extends Employee {

    public Programmer(String name, double experience, double salery, String designation) {
        super(name, experience, salery, designation);

    }

    @Override
    public String toString() {
        return "Programmer{" + '}' + super.toString();
    }

    @Override
    public void calculateBonusOfEmployee() {
        System.out.println(" " + getName() + " earns " + getSalery() * 0.1 + " in bonus");

    }
}
