package models;

public class Souvenir {

    private int id;
    private String name;
    private int details;
    private String date;
    private int price;

    public Souvenir(){}

    public void setId(int _id){
        this.id = _id;
    }

    public int getId(){
        return id;
    }

    public void setName(String _name){
        this.name = _name;
    }

    public String getName(){
        return name;
    }

    public void setDetails(int _details){
        this.details = _details;
    }

    public int getDetails(){
        return details;
    }

    public void setDate(String _date){
        this.date = _date;
    }

    public String getDate(){
        return date;
    }

    public void setPrice(int _price){
        this.price = _price;
    }

    public int getPrice(){
        return price;
    }

    public String toString(){
        String str = getId() + getName() + getDetails() + getDate() + getPrice();
        return str;
    }
}
