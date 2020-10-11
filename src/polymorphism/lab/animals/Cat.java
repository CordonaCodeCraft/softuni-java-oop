package polymorphism.lab.animals;

public class Cat extends Animal {

    public Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        return String.format("I am %s and my favourite food is %s",this.getName(), this.getFavouriteFood())
                + System.lineSeparator()
                + "MEEOW";
    }
}
