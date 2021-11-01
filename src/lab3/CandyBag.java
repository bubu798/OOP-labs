package lab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.ArrayList;

public class CandyBag {
    public static void main(String[] args) {
        List<CandyBox> cutie = new ArrayList<>();
        cutie.add(new Lindt(10.0f, 5.0f, 3.0f, "chocolate", "italian" ));
        cutie.add(new Baravelli(1.0f, 5.0f, "french", "vanilla" ));
        cutie.add(new ChocAmor(10.0f,  "italian", "vanilla" ));

        System.out.println(cutie.get(0));
        System.out.println(cutie.get(1));
        System.out.println(cutie.get(2));
    }
}
