package encapsulation.exercises.football_team_generator;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        setName(name);
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    private boolean isValidParameter(int parameter) {
        return parameter >= 0 && parameter <= 100;
    }

    private void throwIllegalArgumentException(String parameterType) {
        throw new IllegalArgumentException(String.format("%s should be between 0 and 100.", parameterType));
    }

    public double overallSkillLevel() {
        return (this.endurance
                + this.sprint
                + this.dribble
                + this.passing
                + this.shooting)
                * 1.0 / 5;
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("A name should not be empty.");
        } else {
            this.name = name;
        }
    }

    private void setEndurance(int endurance) {
        if (isValidParameter(endurance)) {
            this.endurance = endurance;
        } else {
            throwIllegalArgumentException("Endurance");
        }
    }

    private void setSprint(int sprint) {
        if (isValidParameter(sprint)) {
            this.sprint = sprint;
        } else {
            throwIllegalArgumentException("Sprint");
        }
    }

    private void setDribble(int dribble) {
        if (isValidParameter(dribble)) {
            this.dribble = dribble;
        } else {
            throwIllegalArgumentException("Dribble");
        }
    }

    private void setPassing(int passing) {
        if (isValidParameter(passing)) {
            this.passing = passing;
        } else {
            throwIllegalArgumentException("Passing");
        }
    }

    private void setShooting(int shooting) {
        if (isValidParameter(shooting)) {
            this.shooting = shooting;
        } else {
            throwIllegalArgumentException("Shooting");
        }
    }

}
