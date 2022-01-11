import geekbrainsexception.MyArraySizeException;

public class Training {
    public static void main(String[] args) {

        String[][] array = {{"1"}, {"2"}, {"3"}, {"4"}};
        

    }

    public static void checkArray(String[][] array) {
        if (array.length != 4) {
            throw new MyArraySizeException("length of array != 4");
        }

    }
}
