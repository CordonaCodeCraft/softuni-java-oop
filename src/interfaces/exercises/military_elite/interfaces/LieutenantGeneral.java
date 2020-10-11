package interfaces.exercises.military_elite.interfaces;

import interfaces.exercises.military_elite.implementations.PrivateImpl;

import java.util.Set;

public interface LieutenantGeneral extends Private {

     Set<PrivateImpl> getPrivatesUnderCommand();

}
