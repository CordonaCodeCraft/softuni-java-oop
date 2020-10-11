package interfaces.exercises.military_elite.assets;

import interfaces.exercises.military_elite.enums.State;

import java.util.Objects;

public class Mission implements Comparable<Mission> {
    private final String codeName;
    private final State state;

    public Mission(String codeName, State state) {
        this.codeName = codeName;
        this.state = state;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Mission mission = (Mission) other;
        return codeName.equals(mission.codeName) &&
                state.equals(mission.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeName, state);
    }

    @Override
    public int compareTo(Mission other) {
        return this.codeName.compareTo(other.codeName);
    }

    public State getState() {
        return this.state;
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s", this.codeName, this.state.toString());
    }
}
