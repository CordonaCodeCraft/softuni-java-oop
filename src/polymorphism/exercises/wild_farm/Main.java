package polymorphism.exercises.wild_farm;

import polymorphism.exercises.wild_farm.repository.Factory;
import polymorphism.exercises.wild_farm.utils.FoodDistributor;
import polymorphism.exercises.wild_farm.utils.InputProcessor;

public class Main {

    public static void main(String[] args) {

        Factory.processTokens(InputProcessor.parseTokens());

        FoodDistributor.distributeFood();

        System.out.println();

    }


}
