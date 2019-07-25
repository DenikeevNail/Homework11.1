package com.company;

public class Wheel {
    private int size;

    public Wheel(int size, String name) {
        this.setSize(15);
        this.setName("Yokohama");
    }

    private String name;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
