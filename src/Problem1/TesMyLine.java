//Author: Kyle Hollett
//Date: 2024-09-30
//Description: To be filled in.

package Problem1;

public class TesMyLine {
    public static void main(String[] args) {
        MyLine line1 = new MyLine(0, 0, 3, 4);
        System.out.println("Line 1: " + line1);
        System.out.println("Length: " + line1.getLength());
        System.out.println("Gradient: " + line1.getGradient());

        MyPoint p1 = new MyPoint(2, 2);
        MyPoint p2 = new MyPoint(5, 6);
        MyLine line2 = new MyLine(p1, p2);
        System.out.println("Line 2: " + line2);

        // Test other methods here
    }
}//end main
