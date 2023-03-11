package database;

import java.sql.SQLException;
import java.sql.Statement;

public class EditFromDatabase {
    DatabaseStatement databaseStatement;
    private Statement statement;

    public EditFromDatabase() {
        databaseStatement = new DatabaseStatement();
        statement = databaseStatement.getDatabaseStatement();
    }

    public void EditSouvenirToDatabase(int id, String name, String details, String date, int price) {
        String str = "update souvenirs set name = '" + name
                + "', producerDetails = '" + details
                + "', releaseDate = '" + date
                + "', price = " + price + " where souvenirID = " + id + ";";

        try {
            statement.execute(str);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void EditProducerToDatabase(int id, String name, String country) {
        String str = "update producers set name = '" + name
                + "', country = '" + country
                + "' where producerID = " + id + ";";

        try {
            statement.execute(str);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
