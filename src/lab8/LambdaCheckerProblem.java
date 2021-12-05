package lab8;

import java.util.*;

public class LambdaCheckerProblem {
    public static void main(String[] args) {
        System.out.println("Introduceti nr de elemente pe care vreti sa le adaugati in lista:");
        Scanner input = new Scanner(System.in);
        int hei = input.nextInt();
        System.out.println("Introduceti elementele pe care vreti sa le adaugati in lista sunt:");
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < hei; ++i) {
            int var = input.nextInt();
            if(map.containsKey(var)) {
                map.put(var, map.get(var)+1);
            } else map.put(var, 1);
        }
        for(Map.Entry nr : map.entrySet()) {
            System.out.print(nr.getKey() + ": " + nr.getValue() + "  ");
        }
    }
}
