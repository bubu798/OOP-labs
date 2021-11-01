package lab3;

public class Lindt extends CandyBox {
    float length, width, height;
    public Lindt() {

    }
    public Lindt(float length, float width,
             float height, String flavour, String origin) {
        super(flavour, origin);
        this.length = length;
        this.height = height;
        this.width = width;
    }
    float getVolume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return "The " + getOrigin() + " " + getFlavour() + " has volume " + getVolume();
    }

    public void printLindtDim() {
        System.out.println("length = " + length + ", width = " + width + ", height = " + height);
    }
}
