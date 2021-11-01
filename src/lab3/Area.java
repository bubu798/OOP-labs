package lab3;

import java.sql.SQLOutput;

public class Area {
    CandyBag bag = new CandyBag();
    int number;
    String street;

    public Area() {

    }

    public Area(int number, String street) {
        this.number = number;
        this.street = street;
    }
    public void getBirthdayCard() {
        System.out.println("Street: " + street + " number " + number);
        System.out.println("Happy birthday!");
    }
}
