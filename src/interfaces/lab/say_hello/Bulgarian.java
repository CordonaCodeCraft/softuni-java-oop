package interfaces.lab.say_hello;

public class Bulgarian extends BasePerson {

    protected Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}
