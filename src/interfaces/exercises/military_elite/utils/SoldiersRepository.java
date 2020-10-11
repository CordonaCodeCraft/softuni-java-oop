package interfaces.exercises.military_elite.utils;

import interfaces.exercises.military_elite.interfaces.Private;
import interfaces.exercises.military_elite.interfaces.Soldier;

import java.util.LinkedHashMap;
import java.util.Map;

public class SoldiersRepository {

    private static final Map<Integer, Soldier> soldiers = new LinkedHashMap<>();

    public static void save(Soldier soldier) {
        soldiers.putIfAbsent(soldier.getId(), soldier);
    }

    public static Private retrieveSoldierWithThis(int id) {
        return (Private) soldiers.getOrDefault(id, null);
    }

    public static Map<Integer, Soldier> getSoldiers() {
        return soldiers;
    }

}
