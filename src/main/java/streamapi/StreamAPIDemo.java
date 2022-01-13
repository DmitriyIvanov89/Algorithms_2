package streamapi;

public class StreamAPIDemo {

    private static double val1 = 2.0, val2 = 2.0;

    public static void main(String[] args) {

        Operation operation = new Operation() {
            @Override
            public double getResult(double val1, double val2) {
                return val1 + val2;
            }
        };

        System.out.println(operation.getResult(2.0, 3.0));

        Operation lambda = (val1, val2) -> val1 + val2;
        System.out.println(lambda.getResult(2.0, 2.0));

        Printer printer = str -> System.out.println(str);
        printer.print("Hello");

        Factorial factorial = value -> {
            int result = 1;
            for (int i = 1; i <= value; ++i) {
                result *= i;
            }
            return result;
        };

        System.out.println(factorial.getResult(5));

        OperationTwo operationTwo = () -> {
            val2 = 100;
            return val1 + val2;
        };
        System.out.println(operationTwo.getResult());
        System.out.println(val1);
        System.out.println(val2);


    }
}
