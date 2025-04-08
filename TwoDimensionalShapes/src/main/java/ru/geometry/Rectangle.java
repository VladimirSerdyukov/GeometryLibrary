package ru.geometry;

public class Rectangle {

    private float a1;
    private float a2;

    public Rectangle(){}
    public Rectangle(float a1, float a2){
        this.a1 = a1;
        this.a2 = a2;
    }

    public float getArea() {
        return a1 * a2;
    }

    public float getPerimeter(){
        return (a1 + a2) * 2;
    }

    public float getA1() {
        return a1;
    }

    public void setA1(float a1) {
        this.a1 = a1;
    }

    public float getA2() {
        return a2;
    }

    public void setA2(float a2) {
        this.a2 = a2;
    }
}
