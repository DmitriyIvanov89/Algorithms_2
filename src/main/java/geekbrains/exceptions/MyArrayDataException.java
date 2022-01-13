package geekbrains.exceptions;

public class MyArrayDataException extends MyException {

    private int row;
    private int column;
    private Object value;

    public MyArrayDataException(int row, int column, Object[][] array) {
        super("Invalid data in [" + column + "; " + row + "] " + "value: " + array[column][row]);
        this.row = row;
        this.column = column;
        this.value = array[column][row];
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public Object getValue() {
        return value;
    }
}
