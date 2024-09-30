//Author: Kyle Hollett
//Date: 2024-09-30
//Description: To be filled in.

package Problem1;

public class MyPoint {
    private int x;
    private int y;

    // Constructors
    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters and setters
    public int getX() { return x; }
    public void setX(int x) { this.x = x; }
    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    // Calculate distance to another point
    public double distance(MyPoint another) {
        int xDiff = this.x - another.getX();
        int yDiff = this.y - another.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // toString method
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}