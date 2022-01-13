package geekbrains.exceptions;

import geekbrains.exceptions.MyArrayDataException;
import geekbrains.exceptions.MyArraySizeException;

public class MyExceptionTest {
    public static void main(String[] args) {

        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "A"}
        };

        System.out.println(checkArray(array));

    }
    public static int checkArray(String[][] array) {
        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException(i, j, array);
                }
            }
        }

        return sum;
    }

}
