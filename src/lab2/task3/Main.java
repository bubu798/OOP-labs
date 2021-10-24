package lab2.task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        float[] list = {1, 2, 3, 4, 5, 5.2f, 7.3f, 9.2f};
        Polygon p = new Polygon(list);
        System.out.println(Arrays.toString(p.points));
    }
}
