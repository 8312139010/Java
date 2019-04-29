package se.iths.StaffManagement;

public class Secretary extends Employee {

    public Secretary(String name, double experience, double salery, String designation) {
        super(name, experience, salery, designation);
    }

    @Override
    public String toString() {
        return "Secretary{" + '}' + super.toString();
    }

    @Override
    public void calculateBonusOfEmployee() {
        System.out.println(" " + getName() + " earns " + getSalery() * 0.05 + " in bonus");

    }
}
