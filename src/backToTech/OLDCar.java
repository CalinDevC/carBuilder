package backToTech;
import java.lang.Math;


//encapsulation in class field
public class Car {
    //attributes
    protected String model;
    public String color;
    public String fuelType;
    protected double vin = Math.random();
    private int speed;
    private int stock;
    private boolean isAvailable;

//public constructor method with 4 attributes
    public Car(String model, String color, String fuelType, int speed, double vin) {
        this.model = model;
        this.color = color;
        this.fuelType = fuelType;
        this.speed = speed;
        this.vin = vin;
    }

    public Car() {

    }

    // methods
//protected method only for package classes
    protected int countCarStock (int stock) {
    return stock;
    }

// [ublic getters and setters


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getVin() {
        return vin;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Car(int stock, boolean isAvailable) {
        this.stock = stock;
        this.isAvailable = isAvailable;
    }
}

//inheritance
public class Van extends Car {
    protected boolean isForPassangers;

    }


}

public class Sedan extends Car {

}

public class Break extends Car {

}

