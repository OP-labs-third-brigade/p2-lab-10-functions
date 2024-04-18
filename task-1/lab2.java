
interface MyFunction {
    double calculate(double a, double b, double c, double d);
}

public class lab2 {
    public static void main(String[] args) {
        evaluateFunction((a, b, c, d) -> Math.pow((2 * Math.sin(a) + Math.cos(Math.abs(b * Math.sqrt(c)))), d), 1.234, -3.12, 5.45, 2.0);
        evaluateFunction((a, b, c, d) -> ((Math.log1p(Math.abs(2 * a)))/(3 * Math.tan(b))) - (Math.sqrt((c)/(Math.sqrt(Math.abs(d))))), -2.86, 1.62, 10.874, -2.91);
        evaluateFunction((a, b, c, d) -> ((5 * c)/(Math.cos(a))) + (Math.sqrt((Math.sinh(Math.abs(b) * c))/Math.tan(d))), -3.45, -2.34, 1.45, 0.83);
    }
    
    public static void evaluateFunction(MyFunction function, double a, double b, double c, double d) {
        double result = function.calculate(a, b, c, d);
        System.out.println("Parameters: a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
        System.out.println("Result: " + result);
    }
}
