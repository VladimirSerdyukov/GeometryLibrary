package ru.geometry.figure;

public class Circle {

    private float radius;

    public Circle() {}
    public Circle(float radius){
        this.radius = radius;
    }

    public float getArea() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    public float getPerimeter() {
        return (float) (2 * Math.PI * radius);
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
