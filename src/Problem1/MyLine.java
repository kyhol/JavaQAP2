//Author: Kyle Hollett
//Date: 2024-09-30
//Description: To be filled in.

package Problem1;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    // Constructors
    public MyLine(int x1, int y1, int x2, int y2) {
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Getters and setters
    public MyPoint getBegin() { return begin; }
    public void setBegin(MyPoint begin) { this.begin = begin; }
    public MyPoint getEnd() { return end; }
    public void setEnd(MyPoint end) { this.end = end; }

    // Implement other getters and setters as per the class diagram

    // Calculate length
    public double getLength() {
        return begin.distance(end);
    }

    // Calculate gradient
    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }

    // toString method
    @Override
    public String toString() {
        return "MyLine[begins=" + begin + ", Ends=" + end + "]";
    }
}//end main
