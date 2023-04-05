package com.company;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int distance() {
        return (int) Math.sqrt(((this.x) * (this.x)) + ((this.y) * (this.y)));
    }

    public int distance(int x, int y) {
        return (int) Math.sqrt(((this.x - x) * (this.x - x)) + ((this.y - y) * (this.y - y)));
    }

    public double distance(Point a) {
        return distance(a.x, a.y);
    }
}
