package Problem2;

public class TestMyRectangle {
    public static void main(String[] args) {
        // Test constructor with coordinates
        MyRectangle rect1 = new MyRectangle(0, 5, 3, 0);
        System.out.println("Rectangle 1: " + rect1);
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());

        // Test constructor with MyPoint objects
        MyPoint p1 = new MyPoint(1, 4);
        MyPoint p2 = new MyPoint(5, 2);
        MyRectangle rect2 = new MyRectangle(p1, p2);
        System.out.println("Rectangle 2: " + rect2);

        // Test setters
        rect2.setTopLeft(new MyPoint(0, 5));
        System.out.println("Updated Rectangle 2: " + rect2);

    }
}
