package lab3;

public class ChocAmor extends CandyBox {
    float length;

    public ChocAmor() {

    }
    public ChocAmor(float length, String origin, String flavour) {
        super(flavour, origin);
        this.length = length;
    }
    float getVolume() {
        return length * length;
    }

    @Override
    public String toString() {
        return "The " + getOrigin() + " " + getFlavour() + " has volume " + getVolume();
    }

    public void printChocAmorDim() {
        System.out.println("length = " + length);
    }
}
