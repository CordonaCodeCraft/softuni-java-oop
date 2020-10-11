package interfaces.exercises.military_elite.implementations;

import interfaces.exercises.military_elite.interfaces.LieutenantGeneral;
import interfaces.exercises.military_elite.interfaces.Private;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {

    Set<PrivateImpl> privatesUnderCommand;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        privatesUnderCommand = new TreeSet<>();
    }

    @Override
    public Set<PrivateImpl> getPrivatesUnderCommand() {
        return this.privatesUnderCommand;
    }

    public void addPrivate(Private priv) {
        privatesUnderCommand.add((PrivateImpl) priv);
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append(super.toString()).append(System.lineSeparator());
        builder.append("Privates:");

        if (!privatesUnderCommand.isEmpty()) {

            builder.append(System.lineSeparator());

            this.privatesUnderCommand
                    .stream()
                    .sorted(Comparator.comparingInt(SoldierImpl::getId).reversed())
                    .forEach(soldier -> builder
                            .append(String.format("  %s", soldier.toString()))
                            .append(System.lineSeparator()));
        }

        return builder.toString().trim();
    }
}
