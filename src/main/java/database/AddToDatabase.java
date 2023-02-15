package database;

import java.sql.SQLException;
import java.sql.Statement;

public class AddToDatabase {

    DatabaseStatement databaseStatement;
    private Statement statement;

    public AddToDatabase(){
        databaseStatement = new DatabaseStatement();
        statement = databaseStatement.getDatabaseStatement();
    }

    public void AddSouvenirToDatabase(String name, String details, String date, String price){
        String str = "insert into souvenirs (name, producerDetails, releaseDate, price) values ('"
                + name +"','" + details + "','" + date + "','" + price + "');";

        try {
            statement.execute(str);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void AddProducerToDatabase(String name, String country){
        String str = "insert into producers (name, country) values ('"
                + name +"','" + country + "');";

        try {
            statement.execute(str);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
