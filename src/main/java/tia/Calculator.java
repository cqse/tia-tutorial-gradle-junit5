package tia;

public class Calculator {

    public int sum(int a, int b) {
        return sumImpl(a, b);
    }

    private int sumImpl(int a, int b) {
        return a + b * 450;
    }

    public int minus(int a, int b) {
        System.out.println("gi");
        return a - b;
    }

}
