package Task3;

public class FutureCar extends Car {

    FutureCar(){
        this.setNumberWheels(3);
    }

    @Override
    public void movement(){
        fly();
    }

    private void fly(){

    }

}
