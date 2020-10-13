package polymorphism.exercises.calculator.utils;

import polymorphism.exercises.calculator.enums.Cache;
import polymorphism.exercises.calculator.enums.Operator;
import polymorphism.exercises.calculator.enums.Result;
import polymorphism.exercises.calculator.model.Calculator;

public abstract class Executor {

    public static void compute(Calculator calculator, Long value) {
        Long operand = retrieveOperand(calculator);
        Operator operator = calculator.getOperator();

        switch (operator) {
            case DIVIDE:
                calculator.setResult((operand / value));
                calculator.setOperator(Operator.NONE);
                break;
            case MULTIPLY:
                calculator.setResult((operand * value));
                calculator.setOperator(Operator.NONE);
                break;
        }

    }

    public static Long retrieveOperand(Calculator calculator) {

        if (calculator.getCacheState().equals(Cache.UNLOCKED)) {
            return calculator.getCache();
        } else if (calculator.getResultState().equals(Result.UNLOCKED)) {
            return calculator.getResult();
        } else if (!calculator.getMemory().isEmpty()) {
            return calculator.getMemory().pop();
        } else {
            return null;
        }
    }
}
