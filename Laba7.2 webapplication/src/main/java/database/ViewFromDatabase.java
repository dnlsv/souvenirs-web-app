package database;

import models.Producer;
import models.Souvenir;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ViewFromDatabase {

    private final String souvenirQuery = "select * from souvenirs";
    private final String producerQuery = "select * from producers";
    DatabaseStatement databaseStatement;
    private Statement statement;
    private ResultSet resultSet;
    ArrayList<Souvenir> souvenirArrayList = new ArrayList<Souvenir>();
    ArrayList<Producer> producerArrayList = new ArrayList<Producer>();

    public ViewFromDatabase(){
        databaseStatement = new DatabaseStatement();
        statement = databaseStatement.getDatabaseStatement();
    }

    public void ViewSouvenirsFromDatabase(){
        try {
            resultSet = statement.executeQuery(souvenirQuery);

            while(resultSet.next()){
                Souvenir souvenir = new Souvenir();
                souvenir.setId(resultSet.getInt(1));
                souvenir.setName(resultSet.getString(2));
                souvenir.setDetails(resultSet.getInt(3));
                souvenir.setDate(resultSet.getString(4));
                souvenir.setPrice(resultSet.getInt(5));
                souvenirArrayList.add(souvenir);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public ArrayList<Souvenir> getSouvenirArrayList(){
        return souvenirArrayList;
    }

    public void ViewProducersFromDatabase(){
        try {
            resultSet = statement.executeQuery(producerQuery);

            while(resultSet.next()){
                Producer producer = new Producer();
                producer.setProducerId(resultSet.getInt(1));
                producer.setProducerName(resultSet.getString(2));
                producer.setProducerCountry(resultSet.getString(3));
                producerArrayList.add(producer);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public ArrayList<Producer> getProducerArrayList(){
        return producerArrayList;
    }
}
