package com.company;

public abstract class Cars {
    private int steeringwheel;
    private int wheel;
    private String name;

    public Cars(int steeringwheel, int wheel, String name) {
        this.setSteeringwheel(12);
        this.setWheel(15);
        this.setName("Lexus");
    }

    public int getSteeringwheel() {
        return steeringwheel;
    }

    public void setSteeringwheel(int steeringwheel) {
        this.steeringwheel = steeringwheel;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public String getFirm() {
        return name;
    }

    public void setName(String firm) {
        this.name = firm;
    }
}
