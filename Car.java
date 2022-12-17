package backToTech
public class Car {
    //attributes
    private String model;
    private String color;
    private String fuelType;
    private int speed;
    private int stock;

    //methods
    public int countCarStock (int) {
    return stock;
    }
    public modifyColor(String color);

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}

public class Van extends Car {

}

public class Sedan extends Car {

}

public class Break extends Car {

}

