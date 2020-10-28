package labsheet8.exercise2;
//Vehicle.java
/*
A concrete class that defines a generic Vehicle
 */

public class Vehicle {
    private double price;
    private double length;
    private double height;
    private double weight;
    private String manufacturer;
    private String model;

    public Vehicle() {
        this(0,0,0,0, "No manufacturer specified","No model specified");

    }

    public Vehicle(double pr, double len, double hgt, double wgt, String mft, String mod) {
        setPrice(pr);
        setLength(len);
        setHeight(hgt);
        setWeight(wgt);
        setManufacturer(mft);
        setModel(mod);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double pr) {
        price = pr;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double len) {
        length = len;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double hgt) {
        height = hgt;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double wgt) {
        weight = wgt;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String mft) {
        manufacturer = mft;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String mod) {
        model = mod;
    }

    @Override
    public String toString() {
        return "\nPrice: " + getPrice() + "\nLength: " + getLength() +
                "\nHeight: " + getHeight() + "\nWeight: " + getWeight() +
                "\nManufacturer: " + getManufacturer() + "\nModel: " + getModel();
    }
}
