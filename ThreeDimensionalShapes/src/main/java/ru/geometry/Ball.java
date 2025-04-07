package ru.geometry;

public class Ball {
    private float radius;

    public Ball(){}
    public Ball(float radius) {
        this.radius = radius;
    }

    public float getVolumeBall(){
        return (float) (1.33333 * Math.PI * Math.pow(radius, 3));
    }
}
