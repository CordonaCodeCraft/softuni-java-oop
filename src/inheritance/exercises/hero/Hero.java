package inheritance.exercises.hero;

public class Hero {
    private String userName;
    private Integer level;

    public Hero(String name, Integer level) {
        this.userName = name;
        this.level = level;
    }

    public String getUserName() {
        return this.userName;
    }

    public Integer getLevel() {
        return this.level;
    }

    @Override
    public String toString() {
        return String.format("Type: %s Username: %s Level: %s",
                this.getClass().getName(),
                this.getUserName(),
                this.getLevel());
    }
}
