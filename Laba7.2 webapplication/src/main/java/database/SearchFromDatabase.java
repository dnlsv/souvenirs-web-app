package database;

import models.Producer;
import models.Souvenir;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;

public class SearchFromDatabase {
    DatabaseStatement databaseStatement;
    private Statement statement;
    private ResultSet resultSet;
    ArrayList<Souvenir> souvenirArrayList = new ArrayList<Souvenir>();
    ArrayList<Producer> producerArrayList = new ArrayList<Producer>();

    public SearchFromDatabase(){
        databaseStatement = new DatabaseStatement();
        statement = databaseStatement.getDatabaseStatement();
    }

    public ArrayList<Integer> SearchProducerNameFromDatabase(String producerName){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        String producerQuery = "select producerID from producers where name = '" + producerName +"';";
        int id = 0;
        try {
            resultSet = statement.executeQuery(producerQuery);
            while(resultSet.next()) {
                id = resultSet.getInt(1);
                arrayList.add(id);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return arrayList;
    }

    public ArrayList<Integer> SearchCountryFromDatabase(String country){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        String producerQuery = "select producerID from producers where country = '" + country +"';";
        int id = 0;
        try {
            resultSet = statement.executeQuery(producerQuery);
            while(resultSet.next()) {
                id = resultSet.getInt(1);
                arrayList.add(id);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return arrayList;
    }

    public void SearchSouvenirsFromDatabase(ArrayList<Integer> arrayId) {
        for (int i = 0; i < arrayId.size(); i++) {
            int id = arrayId.get(i);
            String souvenirQuery = "select * from souvenirs where producerDetails = " + id + ";";

            try {
                resultSet = statement.executeQuery(souvenirQuery);

                while (resultSet.next()) {
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
    }

    public ArrayList<Souvenir> getSouvenirArrayList(){
        return souvenirArrayList;
    }

    public HashSet<Integer> SearchPriceFromDatabase(int price){
        //ArrayList<Integer> arrayList = new ArrayList<Integer>();
        HashSet<Integer> hashSet = new HashSet<Integer>();
        String souvenirQuery = "select producerDetails from souvenirs where price < " + price + ";";
        int details = 0;
        try {
            resultSet = statement.executeQuery(souvenirQuery);
            while(resultSet.next()) {
                details = resultSet.getInt(1);
                hashSet.add(details);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return hashSet;
    }

    public HashSet<Integer> SearchNameAndDateFromDatabase(String name, String date){
        HashSet<Integer> hashSet = new HashSet<Integer>();
        String souvenirQuery = "select producerDetails from souvenirs where name = '" + name + "' and year(releaseDate) = '" + date + "';";
        int details = 0;
        try {
            resultSet = statement.executeQuery(souvenirQuery);
            while(resultSet.next()) {
                details = resultSet.getInt(1);
                hashSet.add(details);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return hashSet;
    }

    public void SearchProducersFromDatabase(HashSet<Integer> arrayDetails) {
        for (int i : arrayDetails) {
            int details = i;
            String producerQuery = "select * from producers where producerID = " + details + ";";

            try {
                resultSet = statement.executeQuery(producerQuery);

                while (resultSet.next()) {
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
    }

    public ArrayList<Producer> getProducerArrayList(){
        return producerArrayList;
    }

}
