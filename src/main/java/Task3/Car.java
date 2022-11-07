package Task3;

import java.awt.*;

enum TypeCar {
    SEDAN,
    PICKUP
    }

enum TypeFuel{
    GASOLINE,
    DIESEL
}

enum TypeGearBox{
    MT,
    AT
}

abstract class Car {

    private String model;
    private String make;
    private Color color;
    private TypeCar bodyType;
    private int numberWheels;
    private TypeFuel fuelType;
    private TypeGearBox gearboxType;
    private double engineCapacity;

    public void sweeping(){}

    public void movement(){}
    public void maintenance(){}
    public boolean gearShifting(){return true;}
    public boolean switchHeadlights(){return true;}
    public boolean switchWipers(){return true;}

    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}

    public String getMake() {return make;}
    public void setMake(String make) {this.make = make;}

    public Color getColor() {return color;}
    public void setColor(Color color) {this.color = color;}

    public TypeCar getBodyType() {return bodyType;}
    public void setBodyType(TypeCar bodyType) {this.bodyType = bodyType;}

    public int getNumberWheels() {return numberWheels;}
    public void setNumberWheels(int numberWheels) {this.numberWheels = numberWheels;}

    public TypeFuel getFuelType() {return fuelType;}
    public void setFuelType(TypeFuel fuelType) {this.fuelType = fuelType;}

    public TypeGearBox getGearboxType() {return gearboxType;}
    public void setGearboxType(TypeGearBox gearboxType) {this.gearboxType = gearboxType;}

    public double getEngineCapacity() {return engineCapacity;}
    public void setEngineCapacity(double engineCapacity) {this.engineCapacity = engineCapacity;}
}
