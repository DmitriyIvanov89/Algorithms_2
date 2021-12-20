package algorithms;

import java.util.Arrays;

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

    // O(n)
    private static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // O(Log2n)
    // Только отсортированный массив
    private static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (key > array[middle]) {
                left = middle + 1;
            } else if (key < array[middle]) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    private static int binarySearchRecursive(int[] array, int left, int right, int key) {
        int middle = (left + right) / 2;
        if (left > right) {
            return -1;
        } else if (key < array[middle]) {
            return binarySearchRecursive(array, left, middle - 1, key);
        } else if (key > array[middle]) {
            return binarySearchRecursive(array, middle + 1, right, key);
        } else {
            return middle;
        }
    }

    //int[] array = new int[] {32,14,25,66,78,1,12,14,5,36,2,19,69,45,3,28,7};
    // O(n^2)
    private static void bubbleSort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    isSorted = false;
                }
            }
        }
    }

}
