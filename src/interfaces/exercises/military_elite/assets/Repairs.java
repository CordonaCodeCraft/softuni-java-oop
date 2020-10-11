package interfaces.exercises.military_elite.assets;

import java.util.Objects;

public class Repairs implements Comparable<Repairs> {
    private final String partName;
    private final int hoursWorked;

    public Repairs(String partName, int hoursWorked) {
        this.partName = partName;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Repairs repairs = (Repairs) other;
        return hoursWorked == repairs.hoursWorked &&
                partName.equals(repairs.partName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partName, hoursWorked);
    }

    @Override
    public int compareTo(Repairs other) {
        return Integer.compare(this.hoursWorked, other.hoursWorked);
    }

    @Override
    public String toString() {
        return String.format("Part Name: %s Hours Worked: %d", this.partName, this.hoursWorked);
    }
}
