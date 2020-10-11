package interfaces.exercises.military_elite.implementations;

import interfaces.exercises.military_elite.interfaces.Private;

public class PrivateImpl extends SoldierImpl implements Private {

    private final double salary;

    public PrivateImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %d Salary: %.2f",
                this.getFirstName(),
                this.getLastName(),
                this.getId(),
                this.getSalary());
    }
}
