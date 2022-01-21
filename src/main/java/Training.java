import java.sql.*;

public class Training {

    private static Connection connection;
    private static Statement statement;
    private static PreparedStatement preparedStatement;

    public static void main(String[] args) {

        try {
            connect();
            clearTable();
            

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }

    }

    private static void rollbackEx() throws SQLException {
        statement.executeUpdate("INSERT INTO students (name, score) VALUES ('Dima',150);");
        Savepoint sp = connection.setSavepoint();
        statement.executeUpdate("INSERT INTO students (name, score) VALUES ('Bob',100);");
        connection.rollback(sp);
        statement.executeUpdate("INSERT INTO students (name, score) VALUES ('Bob2',110);");
    }

    private static void transactionPrepareStatementEx() throws SQLException {
        long time = System.currentTimeMillis();
        connection.setAutoCommit(false);
        for (int i = 0; i < 10000; i++) {
            preparedStatement.setString(1, "Bob" + (i + 1));
            preparedStatement.setInt(2, 50);
            preparedStatement.executeUpdate();
        }
        connection.commit();
        System.out.println(System.currentTimeMillis() - time);
    }

    private static void clearTable() throws SQLException {
        statement.executeUpdate("DELETE FROM students;");
    }

    private static void updateEx() throws SQLException {
        statement.executeUpdate("UPDATE students SET score = 120 where name = 'Dima';");
    }

    private static void insertEx() throws SQLException {
        statement.executeUpdate("INSERT INTO students (name, score) VALUES ('Dima', 100);");
    }

    public static void selectEx() {
        try (ResultSet rs = statement.executeQuery("SELECT * FROM students;")) {

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString("name") + " " + rs.getInt("score"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void connect() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/stecl/Downloads/tmp/SQLiteStudio/Новая папка/main.db");
            statement = connection.createStatement();
            preparedStatement = connection.prepareStatement("INSERT INTO students(name,score) VALUES (?,?);");
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
