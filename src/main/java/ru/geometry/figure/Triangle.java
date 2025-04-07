package ru.geometry.figure;

public class Triangle {

    private float a;
    private float b;
    private float c;

    public Triangle() {}
    public Triangle(float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getArea(){
        float p = (a + b + c) / 2;
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static float getAreaBySidesAndAngle(float sideA, float sideB, int angle){
        return (float) (0.5 * sideA * sideB * Math.sin(angle));
    }

    public float getPerimeter(){
        return a + b + c;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
}
