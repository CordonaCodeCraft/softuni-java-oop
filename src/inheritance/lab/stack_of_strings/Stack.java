package inheritance.lab.stack_of_strings;

import java.util.ArrayList;

public class Stack {
    private final ArrayList<String> data;

    public Stack() {
        this.data = new ArrayList<>();
    }

    public void push(String item) {
        this.data.add(item);
    }

    public String pop() {
       return this.data.remove(this.data.size() - 1);
    }

    public String peek() {
        return this.data.get(this.data.size() - 1);
    }

    public boolean isEmpty() {
        return this.data.isEmpty();
    }

}
