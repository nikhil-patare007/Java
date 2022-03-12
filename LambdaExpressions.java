package javademo.practice;

interface MathOperation {
    int operation(int a, int b);
}


public class LambdaExpressions {
    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    public static void main(String[] args) {
        LambdaExpressions lambdaExpressions =new LambdaExpressions();
        MathOperation addition = (int a, int b) -> a + b;
        System.out.println("10 + 5 = " + lambdaExpressions.operate(10, 5, addition));
    }
}
