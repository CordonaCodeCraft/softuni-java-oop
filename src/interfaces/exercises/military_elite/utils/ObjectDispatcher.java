package interfaces.exercises.military_elite.utils;

import interfaces.exercises.military_elite.assets.Mission;
import interfaces.exercises.military_elite.assets.Repairs;
import interfaces.exercises.military_elite.enums.State;
import interfaces.exercises.military_elite.implementations.CommandoImpl;
import interfaces.exercises.military_elite.implementations.EngineerImpl;
import interfaces.exercises.military_elite.implementations.LieutenantGeneralImpl;
import interfaces.exercises.military_elite.interfaces.Private;

import java.util.Arrays;
import java.util.Deque;

public class ObjectDispatcher {

    public static void assignPrivateToThis(LieutenantGeneralImpl general, Deque<String> tokens) {

        while (!tokens.isEmpty()) {
            int id = Integer.parseInt(tokens.remove());
            Private priv = SoldiersRepository.retrieveSoldierWithThis(id);

            if (priv != null) {
                general.addPrivate(priv);
            }
        }
    }

    public static void assignMissionToThis(CommandoImpl commando, Deque<String> tokens) {

        while (!tokens.isEmpty()) {
            String name = tokens.remove();
            String state = tokens.remove().toUpperCase();

            if (isValidMission(state)) {
                commando.addMission(new Mission(name, State.valueOf(state)));
            }
        }
    }

    public static void assignRepairToThis(EngineerImpl engineer, Deque<String> tokens) {

        while (!tokens.isEmpty()) {
            String name = tokens.remove();
            int hoursWorked = Integer.parseInt(tokens.remove());
            engineer.addRepair(new Repairs(name, hoursWorked));
        }
    }

    private static boolean isValidMission(String state) {

        return Arrays
                .stream(State.values())
                .map(Enum::toString)
                .anyMatch(en -> en.equals(state));

    }

}
