package interfaces.exercises.military_elite.implementations;

import interfaces.exercises.military_elite.assets.Mission;
import interfaces.exercises.military_elite.enums.Corp;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class CommandoImpl extends SpecialisedSoldierImpl {
    private final Set<Mission> missions;

    public CommandoImpl(int id, String firstName, String lastName, double salary, Corp corp) {
        super(id, firstName, lastName, salary, corp);
        this.missions = new LinkedHashSet<>();
    }

    public void completeMission() {

    }

    public void addMission(Mission mission) {
        this.missions.add(mission);
    }

    public Collection<Mission> getMissions() {
        return this.missions;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        String corp = super.getCorp().name().substring(0, 1).toUpperCase() + super.getCorp().name().substring(1).toLowerCase();

        builder.append(super.toString()).append(System.lineSeparator());
        builder.append(String.format("Corps: %s", corp)).append(System.lineSeparator());
        builder.append("Missions:");

        if (!this.missions.isEmpty()) {

            builder.append(System.lineSeparator());

            this.missions
                    .stream()
                    .filter(mission -> mission.getState().toString().equals("INPROGRESS"))
                    .forEach(mission -> builder
                            .append(String.format("  %s", mission.toString()))
                            .append(System.lineSeparator()));
        }

        return builder.toString().trim();
    }
}

