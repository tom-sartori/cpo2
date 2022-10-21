import java.sql.*;

public class App {

    public static void main(String[] args) throws SQLException {
        System.out.println("Hello world!");

        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5434/app_db",
                "postgres", "postgres");

        System.out.println(connection.isValid(1));

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM users;");

        while (resultSet.next()) {
            System.out.println(resultSet.getString("first_name"));
        }
    }
}
