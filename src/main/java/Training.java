import java.sql.Connection;
import java.sql.Statement;

public class Training {

    private static Connection connection;
    private static Statement statement;

    public static void main(String[] args) {


    }

    public static void connect() throws ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
    }
}
