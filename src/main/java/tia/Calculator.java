package tia;

public class Calculator {

    public int sum(int a, int b) {
        return sumImpl(a, b);
    }

    private int sumImpl(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        System.out.println("tia rocks");
        return a - b;
    }

}
