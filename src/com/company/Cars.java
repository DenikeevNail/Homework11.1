package com.company;

public abstract class Cars {
    private boolean steeringwheel;
    private int wheel;
    private String name;

    public Cars(boolean steeringwheel, int wheel, String name) {
        this.setSteeringwheel(steeringwheel);
        this.setWheel(4);
        this.setName("Lexus");
    }


    public boolean isSteeringwheel() {
        return steeringwheel;
    }

    public void setSteeringwheel(boolean steeringwheel) {
        this.steeringwheel = steeringwheel;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
