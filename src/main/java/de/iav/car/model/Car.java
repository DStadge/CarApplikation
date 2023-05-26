package de.iav.car.model;

import java.util.Objects;

public class Car {

    private String manufactor;
    private String model;
    private boolean hu;
    private int seat;

    public Car(String manufactor, String model, boolean hu, int seat) {
        this.manufactor = manufactor;
        this.model = model;
        this.hu = hu;
        this.seat = seat;
    }

    public String getManufactor() {
        return manufactor;
    }

    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isHu() {
        return hu;
    }

    public void setHu(boolean hu) {
        this.hu = hu;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return hu == car.hu && seat == car.seat && Objects.equals(manufactor, car.manufactor) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufactor, model, hu, seat);
    }

    @Override
    public String toString() {
        return "car{" +
                "manufactor='" + manufactor + '\'' +
                ", model='" + model + '\'' +
                ", hu=" + hu +
                ", seat=" + seat +
                '}';
    }
}
