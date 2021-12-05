package lab8;

import java.util.TreeSet;

public class AddEvenNR extends TreeSet<Integer> {
    @Override
    public boolean add(Integer integer) {
        if(integer%2 == 0) return super.add(integer);
        return true;
    }
}
