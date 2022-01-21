import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Training {

    private static Connection connection;
    private static Statement statement;

    public static void main(String[] args) {

        try {
            connect();
            statement.executeUpdate("INSERT INTO students (name, score) VALUES ('Dima', 100);");


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }

    }

    public static void connect() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
//            connection = DriverManager.getConnection("jdbc:sqlite:C:Users:stecl:Downloads:tmp:SQLiteStudio:Новая папка:main.db");
            connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/stecl/Downloads/tmp/SQLiteStudio/Новая папка/main.db");
            statement = connection.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            throw new SQLException("Unable to connect");
        }
    }

    public static void disconnect() {
        try {
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
