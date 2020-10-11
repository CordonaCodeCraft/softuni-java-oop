package inheritance.exercises.animals;

public class Dog extends Animal {

    public Dog(String name, Integer age, String gender) {
        super(name, age, gender);
    }

    public String produceSound() {
        return "Woof!";
    }
}
