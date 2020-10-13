package polymorphism.exercises.word.entities;

import java.util.ArrayDeque;
import java.util.Deque;

public class Text {
    private String text;
    private final Deque<String> textFragments;

    public Text(String text) {
        this.text = text;
        this.textFragments = new ArrayDeque<>();
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Deque<String> getTextFragments() {
        return this.textFragments;
    }

}
