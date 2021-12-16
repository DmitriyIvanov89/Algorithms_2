package algorithms;

public class Algorithms {
    public static void main(String[] args) {

        System.out.println(getRecursiveFactorial(5));
        System.out.println(getNativeFactorial(5));

    }

    private static long getRecursiveFactorial(int n) {
        if (n <= 1) return n;
        else return n * getRecursiveFactorial(n - 1);
    }

    private static long getNativeFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

}
