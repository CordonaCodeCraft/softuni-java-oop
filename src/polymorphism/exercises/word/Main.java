package polymorphism.exercises.word;

import polymorphism.exercises.word.entities.Text;
import polymorphism.exercises.word.servicies.CommandService;
import polymorphism.exercises.word.servicies.impl.CommandServiceImpl;

import java.util.Scanner;

public class Main {

    private static final CommandService commandService = new CommandServiceImpl();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String textInput = scanner.nextLine();
        Text text = new Text(textInput);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            } else {
                executeCommand(input, text);
            }
        }

        System.out.println(text.getText());

    }

    private static void executeCommand(String input, Text text) {
        String targetText = text.getText();
        String[] tokens = input.split("\\s+");
        String command = tokens[0];
        Integer startIndex = Integer.parseInt(tokens[1]);
        Integer endIndex = Integer.parseInt(tokens[2]);

        if (!startIndex.equals(endIndex)) {
            switch (command) {
                case "cut":
                    String[] products = commandService.cut(targetText, startIndex, endIndex);
                    String fragment = products[0];
                    String newText = products[1];
                    text.setText(newText);
                    text.getTextFragments().push(fragment);
                    break;
                case "paste":
                    String lastFragment = text.getTextFragments().pop();
                    String product = commandService.paste(targetText, lastFragment, startIndex, endIndex);
                    text.setText(product);
                    break;
                case "uppercase":
                    String upperCaseProduct = commandService.toUpperCase(targetText, startIndex, endIndex);
                    text.setText(upperCaseProduct);
            }
        }

    }

}
