package polymorphism.exercises.calculator.utils;

import polymorphism.exercises.calculator.enums.InputType;

public abstract class Interpreter {

    public static InputType interpret(String input) {

        boolean isInteger = Character.isDigit(input.charAt(0));
        boolean isOperator = input.charAt(0) == '/' || input.charAt(0) == '*';
        boolean isCommand = input.contains("m");

        if (isInteger) {
            return InputType.INTEGER;
        } else if (isOperator) {
            return InputType.OPERATOR;
        } else if (isCommand) {
            return InputType.COMMAND;
        } else {
            return null;
        }
    }

}
                                                                    