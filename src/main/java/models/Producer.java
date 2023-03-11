package models;

public class Producer {

    private int producerId;
    private String producerName;
    private String producerCountry;

    public Producer() {
    }

    public int getProducerId() {
        return producerId;
    }

    public void setProducerId(int _id) {
        this.producerId = _id;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String _name) {
        this.producerName = _name;
    }

    public String getProducerCountry() {
        return producerCountry;
    }

    public void setProducerCountry(String _country) {
        this.producerCountry = _country;
    }

    public String toString() {
        String str = getProducerId() + getProducerName() + getProducerCountry();
        return str;
    }
}
