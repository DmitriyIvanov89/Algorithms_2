package streamapi;

public class StreamAPIDemo {
    public static void main(String[] args) {

        Operation operation = new Operation() {
            @Override
            public double getResult(double val1, double val2) {
                return val1 + val2;
            }
        };

        System.out.println(operation.getResult(2.0, 3.0));

    }
}
