package tia;

public class Calculator {

    public int sum(int a, int b) {
        return sumImpl(a, b);
    }

    private int sumImpl(int a, int b) {
        a = a * 5;
        return a + b;
    }

    public int minus(int a, int b) {
        System.out.println("gi");
        return a - b;
    }

}
