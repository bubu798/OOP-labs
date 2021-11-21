package lab6.task3;

import lab6.task1.Car;
import lab6.task1.Dealership;
import lab6.task1.Offer;
import java.util.ArrayList;


public class Test {
    public static void main(String[] args) {
        Car benveu = new Car(3000, 2016, Car.CarType.BMW);
        Car mertz = new Car(4000, 2018, Car.CarType.MERCEDES);
        Car golan = new Car(1500, 2015, Car.CarType.GOLAN);
        Dealership neg = new Dealership();

        neg.getFinalPrice(benveu);
        System.out.println("Pret final BMW: " + benveu.pret);
        System.out.println("\n");

        neg.getFinalPrice(mertz);
        System.out.println("Pret final Mertz: " + mertz.pret);
        System.out.println("\n");

        neg.getFinalPrice(golan);
        System.out.println("Pret final Logan: " + golan.pret);
        System.out.println("\n");

        Offer offer = new Offer() {
            public int getDiscount(Car car) {
                System.out.println("Deal accepted! \nApplying client discount: 250");
                return 250;
            }
        };
        neg.negotiate(benveu, offer);
        System.out.println("Pret final dupa negociere BMW: " + benveu.pret);
        System.out.println("\n");

        neg.negotiate(mertz, offer);
        System.out.println("Pret final dupa negociere Mertz: " + mertz.pret);
        System.out.println("\n");

        neg.negotiate(golan, offer);
        System.out.println("Pret final dupa negociere Logan: " + golan.pret);
        System.out.println("\n");

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(benveu);
        cars.add(mertz);
        cars.add(golan);

        cars.forEach((c) -> System.out.println((c)));
        System.out.println();
        cars.removeIf((c) -> c.pret > 1500);
        System.out.println("Masini de buget:");
        cars.forEach((c) -> System.out.println((c)));
    }
}
