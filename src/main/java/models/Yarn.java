package models;

public class Yarn implements YarnDTO{

    private int yarnId;
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

    public Yarn(Integer yarnID, String brand, String color, String fiberType, String weight, Integer yardage, Double price, Integer quantity) {
        this.yarnId = yarnID;
        this.brand = brand;
        this.color = color;
        this.fiberType = fiberType;
        this.weight = weight;
        this.yardage = yardage;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public int getId() {
        return yarnId;
    }

    public void setYarnId(int yarnId) {
        this.yarnId = yarnId;
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

    @Override
    public String toString() {
        return "Yarn{" +
                "yarnId=" + yarnId +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", fiberType='" + fiberType + '\'' +
                ", weight='" + weight + '\'' +
                ", yardage=" + yardage +
                ", price=" + price +
                ", quantity=" + quantity +
                "}\n";
    }
}


