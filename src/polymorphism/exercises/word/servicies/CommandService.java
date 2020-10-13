package polymorphism.exercises.word.servicies;

public interface CommandService {

    String[] cut(String text, Integer startIndex, Integer endIndex);

    String paste(String text, String fragment, Integer startIndex, Integer endIndex);

    String toUpperCase(String text, Integer startIndex, Integer endIndex);

}
