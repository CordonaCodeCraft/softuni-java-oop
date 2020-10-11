package inheritance.lab.stack_of_strings;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push("one");
        stack.push("two");
        stack.push("three");
        
        System.out.println(stack.isEmpty());

        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();



    }
}
