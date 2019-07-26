package com.company;

public abstract class Cars {

    private boolean SteeringWheel;
    private int Wheel;
    private String CarName;


    public Cars(boolean steeringWheel, int wheel, String carName){
        this.setSteeringWheel(steeringWheel);
        this.setWheel(wheel);
        this.setCarName(carName);
    }

    public boolean getSteeringWheel() {
        return SteeringWheel;
    }

    public void setSteeringWheel(boolean steeringWheel) {
        SteeringWheel = steeringWheel;
    }

    public void setWheel(int wheel) {
        Wheel = wheel;
    }

    public String getCarName() {
        return CarName;
    }

    public void setCarName(String carName) {
        CarName = carName;
    }

    public int getWheel() {
        return Wheel;
    }
}
