package lab6.task1;

public class Car {
    public int pret;
    int year;
    public enum CarType {
        BMW,
        MERCEDES,
        GOLAN
    }
    public CarType type;

    public Car(int pret, int year, CarType type) {
        this.pret = pret;
        this.year = year;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "pret=" + pret +
                ", year=" + year +
                ", type=" + type +
                '}';
    }
}
