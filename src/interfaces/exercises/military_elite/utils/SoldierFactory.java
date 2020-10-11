package interfaces.exercises.military_elite.utils;

import interfaces.exercises.military_elite.enums.Corp;
import interfaces.exercises.military_elite.implementations.*;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SoldierFactory {

    public static void constructSoldier(String input) {

        Deque<String> tokens = generateTokensQueue(input);

        String soldierType = tokens.remove();

        switch (soldierType) {

            case "Private":
                PrivateImpl priv = constructPrivate(tokens);
                SoldiersRepository.save(priv);
                break;

            case "Commando":
                CommandoImpl commando = constructCommando(tokens);

                if (commando != null) {
                    SoldiersRepository.save(commando);
                    ObjectDispatcher.assignMissionToThis(commando, tokens);
                }
                break;

            case "Engineer":
                EngineerImpl engineer = constructEngineer(tokens);

                if (engineer != null) {
                    SoldiersRepository.save(engineer);
                    ObjectDispatcher.assignRepairToThis(engineer, tokens);
                }
                break;

            case "Spy":
                SpyImpl spy = constructSpy(tokens);
                SoldiersRepository.save(spy);
                break;

            case "LieutenantGeneral":
                LieutenantGeneralImpl general = constructLieutenantGeneral(tokens);
                SoldiersRepository.save(general);
                ObjectDispatcher.assignPrivateToThis(general, tokens);
                break;
        }

    }

    private static PrivateImpl constructPrivate(Deque<String> tokens) {
        int id = Integer.parseInt(tokens.remove());
        String firstName = tokens.remove();
        String lastName = tokens.remove();
        double salary = Double.parseDouble(tokens.remove());

        return new PrivateImpl(id, firstName, lastName, salary);
    }

    private static CommandoImpl constructCommando(Deque<String> tokens) {
        int id = Integer.parseInt(tokens.remove());
        String firstName = tokens.remove();
        String lastName = tokens.remove();
        double salary = Double.parseDouble(tokens.remove());
        String corp = tokens.remove().toUpperCase();

        if (isValidCorp(corp)) {
            return new CommandoImpl(id, firstName, lastName, salary, Corp.valueOf(corp));
        } else {
            return null;
        }
    }

    private static EngineerImpl constructEngineer(Deque<String> tokens) {
        int id = Integer.parseInt(tokens.remove());
        String firstName = tokens.remove();
        String lastName = tokens.remove();
        double salary = Double.parseDouble(tokens.remove());
        String corp = tokens.remove().toUpperCase();

        if (isValidCorp(corp)) {
            return new EngineerImpl(id, firstName, lastName, salary, Corp.valueOf(corp));
        } else {
            return null;
        }
    }

    private static SpyImpl constructSpy(Deque<String> tokens) {
        int id = Integer.parseInt(tokens.remove());
        String firstName = tokens.remove();
        String lastName = tokens.remove();
        String codeNumber = tokens.remove();

        return new SpyImpl(id, firstName, lastName, codeNumber);
    }

    private static LieutenantGeneralImpl constructLieutenantGeneral(Deque<String> tokens) {
        int id = Integer.parseInt(tokens.remove());
        String firstName = tokens.remove();
        String lastName = tokens.remove();
        double salary = Double.parseDouble(tokens.remove());

        return new LieutenantGeneralImpl(id, firstName, lastName, salary);
    }

    private static Deque<String> generateTokensQueue(String input) {
        Deque<String> tokens = new ArrayDeque<>();
        Arrays.stream(input.split("\\s+")).forEach(tokens::offer);
        return tokens;
    }

    private static boolean isValidCorp(String corp) {

        return Arrays
                .stream(Corp.values())
                .map(Enum::toString)
                .anyMatch(enumerator -> enumerator.equals(corp));

    }

}
