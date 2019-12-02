package kr.co.clipsoft.clipday2019;

public class Calculator {
    private FourArithmeticCalculator fourArithmeticCalculator;

    public Calculator() { 
        fourArithmeticCalculator = new FourArithmeticCalculator();
    }

    public long add(int op1, int op2) {
        return fourArithmeticCalculator.add(op1, op2);
    }

    public long minus(int op1, int op2) {
        return fourArithmeticCalculator.minus(op1, op2);
    }
}
