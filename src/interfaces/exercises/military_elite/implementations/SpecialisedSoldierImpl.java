package interfaces.exercises.military_elite.implementations;

import interfaces.exercises.military_elite.enums.Corp;
import interfaces.exercises.military_elite.interfaces.SpecialisedSoldier;

public abstract class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {

    private final Corp corp;

    public SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary, Corp corp) {
        super(id, firstName, lastName, salary);
        this.corp = corp;
    }

    @Override
    public Corp getCorp() {
        return this.corp;
    }
}
