package database;

import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseStatement {

    DatabaseConnection connection;
    private Statement statement;

    public DatabaseStatement() {
        connection = new DatabaseConnection();
        try {
            statement = connection.getDatabaseConnecion().createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public Statement getDatabaseStatement() {
        return statement;
    }
}
