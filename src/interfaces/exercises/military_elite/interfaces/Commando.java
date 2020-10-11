package interfaces.exercises.military_elite.interfaces;

import interfaces.exercises.military_elite.assets.Mission;

import java.util.Collection;

public interface Commando extends Private {

    Collection<Mission> getMissions();
 
}
