package org.example;

public class Coordinates {


    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Coordinates origin() {
        return new Coordinates(0, 0);
    }

    public Coordinates setY(int y) {
        return new Coordinates(this.x, y);
    }
}
