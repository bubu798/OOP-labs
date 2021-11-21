package lab6.task1;
import java.util.Random;

public class Dealership  {

    private class BrandOffer implements Offer {
        public int getDiscount(Car car) {
            if(car.type == Car.CarType.MERCEDES) {
                return (5 * car.pret)/100;
            }else if(car.type == Car.CarType.BMW) {
                return (10 * car.pret)/100;
            }else if(car.type == Car.CarType.GOLAN) {
                return (20 * car.pret)/100;
            }
            return 0;
        }
    }
    private class DealerOffer implements Offer {
        public int getDiscount(Car car) {
            return (50 * (2021 - car.year));
        }
    }
    private class SpecialOffer implements Offer {
        public int getDiscount(Car car) {
            Random rand = new Random();
            int rand1 = rand.nextInt(300);
            return rand1;
        }
    }
    public void getFinalPrice(Car car) {
        BrandOffer oferta1 = new BrandOffer();
        System.out.println("Applying Brand discount: " + oferta1.getDiscount(car));
        car.pret = car.pret - oferta1.getDiscount(car);
        DealerOffer oferta2 = new DealerOffer();
        System.out.println("Applying Dealer discount: " + oferta2.getDiscount(car));
        car.pret = car.pret - oferta2.getDiscount(car);
        SpecialOffer oferta3 = new SpecialOffer();
        int reducere = oferta3.getDiscount(car);
        System.out.println("Applying Special discount: " + reducere);
        car.pret = car.pret - reducere;
    }
    public void negotiate(Car car, Offer offer) {
        int random = (int)(Math.random() * 2 + 1);
        if(random == 2) {
            car.pret = car.pret - offer.getDiscount(car);
        }
    }
}
