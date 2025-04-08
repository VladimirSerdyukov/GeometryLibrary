package ru.geometry;

public class Cylinder {

    private float height;
    private float radius;
    Circle circle = new Circle();


    public Cylinder(){}
    public Cylinder(float height, float radius){

        this.height = height;
        this.radius = radius;
    }

    public float getVolume(){
        return (float) (Math.PI * Math.sqrt(radius) * height);
    }



}
