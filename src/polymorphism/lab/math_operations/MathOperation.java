package polymorphism.lab.math_operations;

public class MathOperation implements MathOperationService {

    public MathOperation() {

    }



    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    @Override
    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
