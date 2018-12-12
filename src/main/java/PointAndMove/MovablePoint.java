package PointAndMove;

import java.util.Arrays;

public class MovablePoint extends Point {
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float x, float y) {
        setxSpeed(x);
        setySpeed(y);
    }

    public float[] getSpeed() {
        float[] arr = new float[2];
        arr[0] = getxSpeed();
        arr[1] = getySpeed();
        return arr;
    }

    @Override
    public String toString() {
        return super.toString() + ",speed = " + Arrays.toString(getSpeed());
    }

    public void move() {
        super.x += xSpeed;
        super.y += ySpeed;

    }
}
