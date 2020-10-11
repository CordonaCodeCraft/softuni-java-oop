package interfaces.exercises.military_elite.implementations;

import interfaces.exercises.military_elite.interfaces.Soldier;

import java.util.Objects;

public class SoldierImpl implements Soldier, Comparable<SoldierImpl> {

    private final int id;
    private final String firstName;
    private final String lastName;

    public SoldierImpl(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        SoldierImpl soldier = (SoldierImpl) other;
        return id == soldier.id &&
                firstName.equals(soldier.firstName) &&
                lastName.equals(soldier.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }

    @Override
    public int compareTo(SoldierImpl other) {
        return Integer.compare(this.id, other.id);
    }
}
