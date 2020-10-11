package encapsulation.exercises.football_team_generator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private final List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(String playerName) {
        boolean playerIsNotPresent = verifyPlayerIsNotPresent(playerName);

        if (playerIsNotPresent) {
            throw new IllegalArgumentException(String.format("Player %s is not in %s team.", playerName, this.name));
        }  else {
            int playerIndex = players
                    .stream()
                    .filter(player -> player.getName().equals(playerName))
                    .mapToInt(this.players::indexOf)
                    .sum();

            this.players.remove(playerIndex);
        }

    }

    public double getRating() {
        double playersLevelsTotal = this.players
                .stream()
                .map(Player::overallSkillLevel)
                .reduce(0.0, Double::sum);

        if (playersLevelsTotal == 0) {
            return 0;
        } else {
            return playersLevelsTotal / this.players.size();
        }
    }

    public boolean verifyPlayerIsNotPresent(String playerName) {
        return this.players
                .stream()
                .map(Player::getName)
                .noneMatch(name -> name.equals(playerName));
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


}
