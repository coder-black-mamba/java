package OOP;

class Calculator {

    float sum(float a, float b) {
        return a + b;
    }

    float sub(float a, float b) {
        return a - b;
    }

    float mul(float a, float b) {
        return a * b;
    }

    float div(float a, float b) {
        return a / b;
    }
}

public class BasicOOP {

    public static void main(String args[]) {
        int a = 10;
        float b = 20.55f;

        Calculator calc = new Calculator();
        System.out.println(calc.sum(a, b));

    }
}