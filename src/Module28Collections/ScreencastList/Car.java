package Module28Collections.ScreencastList;

public class Car {
    private String brand;
    private String model;
    private boolean isOnSale;

    public Car(String brand, String model, boolean isOnSale) {
        this.brand = brand;
        this.model = model;
        this.isOnSale = isOnSale;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", isOnSale=" + isOnSale +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isOnSale() {
        return isOnSale;
    }

    public void setOnSale(boolean onSale) {
        isOnSale = onSale;
    }
}
