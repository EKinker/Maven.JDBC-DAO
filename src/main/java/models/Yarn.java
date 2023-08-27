package models;

public class Yarn {

    private int yarnID;
    private String brand;
    private String color;
    private String fiberType;
    private String weight;
    private Integer yardage;
    private Double price;
    private Integer quantity;

    public Yarn() {
    }

    public Yarn(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public Yarn(int yarnID, String brand, String color, String fiberType, String weight, Integer yardage, Double price, Integer quantity) {
        this.yarnID = yarnID;
        this.brand = brand;
        this.color = color;
        this.fiberType = fiberType;
        this.weight = weight;
        this.yardage = yardage;
        this.price = price;
        this.quantity = quantity;
    }

    public int getYarnID() {
        return yarnID;
    }

    public void setYarnID(int yarnID) {
        this.yarnID = yarnID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFiberType() {
        return fiberType;
    }

    public void setFiberType(String fiberType) {
        this.fiberType = fiberType;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Integer getYardage() {
        return yardage;
    }

    public void setYardage(Integer yardage) {
        this.yardage = yardage;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}


