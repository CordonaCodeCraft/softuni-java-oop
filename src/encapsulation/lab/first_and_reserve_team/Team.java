package encapsulation.lab.first_and_reserve_team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private final List<Person> firstTeam;
    private final List<Person> reserveTeam;
    private String name;

    public Team(String name) {
        setName(name);
        this.firstTeam = new ArrayList<>();
        this.reserveTeam = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;

    }

    public void addPlayer(Person person) {
        if (person.getAge() < 40) {
            firstTeam.add(person);
        } else {
            reserveTeam.add(person);
        }
    }

    public List<Person> getFirstTeam() {
        return Collections.unmodifiableList(this.firstTeam);
    }

    public List<Person> getReserveTeam() {
        return Collections.unmodifiableList(this.reserveTeam);
    }

    
}
