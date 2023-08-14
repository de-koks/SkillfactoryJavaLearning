package Module28Collections.ScreencastComparator;

import java.util.Objects;

public class Car {
    private final String brand;
    private final String model;
    private boolean isOnSale;

    public Car(String brand, String model, boolean isOnSale) {
        if (brand == null || model == null) throw new IllegalArgumentException();
        this.brand = brand;
        this.model = model;
        this.isOnSale = isOnSale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return brand.equals(car.brand) &&
                model.equals(car.model) &&
                isOnSale == car.isOnSale;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
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

    public String getModel() {
        return model;
    }

    public boolean isOnSale() {
        return isOnSale;
    }

    public void setOnSale(boolean onSale) {
        isOnSale = onSale;
    }
}
