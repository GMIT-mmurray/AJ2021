public class CalculatorDriver {

    public static void main(String[] args) {
        System.out.println("1 + 1 = " + new CalculatorWithFixedOperators(1, 1, "+").operate());
        System.out.println("4 - 2 = " + new CalculatorWithFixedOperators(4, 2, "-").operate());
        System.out.println("1 x 2 = " + new CalculatorWithFixedOperators(1, 2, "x").operate());
        System.out.println("10 / 2 = " + new CalculatorWithFixedOperators(10, 2, "/").operate());

        CalculatorWithFixedOperators calc1 = new CalculatorWithFixedOperators(4,3,"%");
        Double result = calc1.operate();
        System.out.println(result);
    }
}
