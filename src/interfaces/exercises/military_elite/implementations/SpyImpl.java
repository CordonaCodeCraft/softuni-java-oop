package interfaces.exercises.military_elite.implementations;

import interfaces.exercises.military_elite.interfaces.Spy;

public class SpyImpl extends SoldierImpl implements Spy {
    private final String codeNumber;

    public SpyImpl(int id, String firstName, String lastName, String codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public String getCodeNumber() {
        return this.codeNumber;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %d%nCode Number: %s",
                this.getFirstName(),
                this.getLastName(),
                this.getId(),
                this.codeNumber);
    }
}
