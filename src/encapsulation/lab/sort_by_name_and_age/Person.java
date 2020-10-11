package encapsulation.lab.sort_by_name_and_age;

public class Person implements Comparable<Person> {
    private final String firstName;
    private final String lastName;
    private final Integer age;

    public Person(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Integer getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return String.format("%s %s is %d years old.", this.getFirstName(), this.getLastName(), this.age);
    }

    @Override
    public int compareTo(Person other) {
        return this.firstName.compareTo(other.getFirstName());
    }
}
