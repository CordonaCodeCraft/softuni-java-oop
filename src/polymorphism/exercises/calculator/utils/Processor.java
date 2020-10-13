package polymorphism.exercises.calculator.utils;

import polymorphism.exercises.calculator.enums.Cache;
import polymorphism.exercises.calculator.enums.InputType;
import polymorphism.exercises.calculator.enums.Operator;
import polymorphism.exercises.calculator.enums.Result;
import polymorphism.exercises.calculator.model.Calculator;

import static polymorphism.exercises.calculator.utils.Executor.retrieveOperand;

public abstract class Processor {

    public static void processInput(Calculator calculator, String[] tokens) {

        for (String token : tokens) {

            InputType inputType = Interpreter.interpret(token);

            if (inputType != null) {

                switch (inputType) {
                    case INTEGER:
                        Long value = Long.parseLong(token);

                        if (overrideCache(calculator)) {
                            calculator.setCacheState(Cache.UNLOCKED);
                            calculator.setResultState(Result.LOCKED);
                            calculator.setCache(value);
                        } else {
                            Executor.compute(calculator, value);
                            calculator.setCacheState(Cache.LOCKED);
                            calculator.setResultState(Result.UNLOCKED);
                        }
                        break;
                    case OPERATOR:
                        applyOperator(calculator, token);
                        break;
                    case COMMAND:
                        applyCommand(calculator, token);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + inputType);
                }

            }
        }

    }

    private static boolean overrideCache(Calculator calculator) {
        return calculator.getOperator().equals(Operator.NONE);
    }

    private static void applyOperator(Calculator calculator, String token) {
        if (token.charAt(0) == '*') {
            calculator.setOperator(Operator.MULTIPLY);
        } else {
            calculator.setOperator(Operator.DIVIDE);
        }
    }

    private static void applyCommand(Calculator calculator, String token) {

        if (token.equals("ms")) {

            Long operand = retrieveOperand(calculator);
            calculator.getMemory().push(operand);

        } else if (token.equals("mr")) {
            if (calculator.getOperator().equals(Operator.NONE)) {
                calculator.setCacheState(Cache.UNLOCKED);
                calculator.setCache(calculator.getMemory().pop());
            } else {
                Executor.compute(calculator, calculator.getMemory().pop());
            }

        }
    }

}
