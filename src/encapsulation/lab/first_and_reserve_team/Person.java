package encapsulation.lab.first_and_reserve_team;

public class Person {
    private String lastName;
    private int age;
    private String firstName;
    private Double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }

    public String getFirstName() {
        return this.firstName;

    }

    public void setFirstName(String firstName) {
        if (firstName.length() < 3) {
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        } else {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return this.lastName;

    }

    public void setLastName(String lastName) {
        if (lastName.length() < 3) {
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        } else {
            this.lastName = lastName;
        }
    }

    public Integer getAge() {
        return this.age;

    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        } else {
            this.age = age;
        }
    }
 
    public Double getSalary() {
        return this.salary;

    }

    public void setSalary(double salary) {
        if (salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        } else {
            this.salary = salary;
        }
    }

    public void increaseSalary(double percent) {
        double bonus = (this.salary * percent) / 100;
        double actualBonus = this.age < 30 ? bonus /= 2 : bonus;
        double increasedSalary = this.getSalary() + actualBonus;
        this.setSalary(increasedSalary);
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %s leva",
                this.getFirstName(),
                this.getLastName(),
                this.getSalary().toString());
    }
}
