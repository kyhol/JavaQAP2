package Problem2;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(int x1, int y1, int x2, int y2) {
        topLeft = new MyPoint(x1, y1);
        bottomRight = new MyPoint(x2, y2);
    }
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
    // Getters and setters
    public MyPoint getTopLeft() { return topLeft; }
    public void setTopLeft(MyPoint topLeft) { this.topLeft = topLeft; }
    public MyPoint getBottomRight() { return bottomRight; }
    public void setBottomRight(MyPoint bottomRight) { this.bottomRight = bottomRight; }

    // Calculate area
    public double getArea() {
        int width = bottomRight.getX() - topLeft.getX();
        int height = topLeft.getY() - bottomRight.getY();
        return Math.abs(width * height);
    }
    // Calculate perimeter
    public double getPerimeter() {
        int width = bottomRight.getX() - topLeft.getX();
        int height = topLeft.getY() - bottomRight.getY();
        return 2 * (Math.abs(width) + Math.abs(height));
    }

    // toString method
    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ",bottomRight=" + bottomRight + "]";
    }
}
