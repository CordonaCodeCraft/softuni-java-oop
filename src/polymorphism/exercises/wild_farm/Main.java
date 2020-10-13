package polymorphism.exercises.wild_farm;

import polymorphism.exercises.wild_farm.repository.Repository;
import polymorphism.exercises.wild_farm.utils.ObjectFactory;
import polymorphism.exercises.wild_farm.utils.FoodDistributor;
import polymorphism.exercises.wild_farm.utils.InputProcessor;

public class Main {

    public static void main(String[] args) {

        ObjectFactory.processTokens(InputProcessor.parseTokens());

        FoodDistributor.distributeFood();

        Repository.getAnimals().forEach(animal -> System.out.println(animal.toString()));


    }


}
