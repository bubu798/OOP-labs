package lab2.task3;

public class Polygon {
    int n;
    Point[] points;
    public Polygon (int n) {
        this.points = new Point[n];
        for (int i = 0; i < n; ++i) {
            this.points[i] = new Point();
        }
    }
    public Polygon(float[] list) {
        this(list.length/2);
        float x, y;
        for(int i = 0; i < list.length; i += 2) {
            x = list[i];
            y = list[i + 1];
            this.points[i/2].changeCoords(x, y);
        }
    }
}
