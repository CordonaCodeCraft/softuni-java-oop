package interfaces.exercises.military_elite.implementations;

import interfaces.exercises.military_elite.assets.Repairs;
import interfaces.exercises.military_elite.enums.Corp;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class EngineerImpl extends SpecialisedSoldierImpl {

    private final Set<Repairs> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary, Corp corp) {
        super(id, firstName, lastName, salary, corp);
        this.repairs = new LinkedHashSet<>();
    }

    public void addRepair(Repairs repair) {
        repairs.add(repair);
    }

    public Collection<Repairs> getRepairs() {
        return this.repairs;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        String corp = super.getCorp().name().substring(0, 1).toUpperCase() + super.getCorp().name().substring(1).toLowerCase();

        builder.append(super.toString()).append(System.lineSeparator());
        builder.append(String.format("Corps: %s", corp)).append(System.lineSeparator());
        builder.append("Repairs:");

        if (!repairs.isEmpty()) {

            builder.append(System.lineSeparator());

            this.repairs
                    .forEach(repair -> builder
                    .append(String.format("  %s", repair.toString()))
                    .append(System.lineSeparator()));
        }

        return builder.toString().trim();
    }
}
