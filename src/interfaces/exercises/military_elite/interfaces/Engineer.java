package interfaces.exercises.military_elite.interfaces;

import interfaces.exercises.military_elite.assets.Repairs;

import java.util.Collection;

public interface Engineer extends Private {

    public Collection<Repairs> getRepairs();

}
