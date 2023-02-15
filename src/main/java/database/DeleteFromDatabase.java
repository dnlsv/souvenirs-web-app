package database;

import java.sql.SQLException;
import java.sql.Statement;

public class DeleteFromDatabase {
    DatabaseStatement databaseStatement;
    private Statement statement;

    public DeleteFromDatabase(){
        databaseStatement = new DatabaseStatement();
        statement = databaseStatement.getDatabaseStatement();
    }

    public void DeleteSouvenirToDatabase(int id){
        String str = "delete from souvenirs where souvenirID = " + id + ";";

        try {
            statement.execute(str);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void DeleteProducerToDatabase(int id){
        String str = "delete from producers where producerID = " + id + ";";

        try {
            statement.execute(str);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
