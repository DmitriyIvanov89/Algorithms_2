package algorithms;

public class Algorithms {
    public static void main(String[] args) {
        
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

    private static long getRecursiveFibonacci(int n) {
        if (n <= 1) return n;
        else return getRecursiveFibonacci(n - 1) + getRecursiveFibonacci(n - 2);
    }

    private static long getNativeFibonacci(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

}
