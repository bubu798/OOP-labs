package lab3;

public class Baravelli extends CandyBox {
    float radius, height;

    public Baravelli() {

    }
    public Baravelli(float radius, float height, String origin, String flavour) {
        super(flavour, origin);
        this.radius = radius;
        this.height = height;
    }
    float getVolume() {
        return 3.14f * radius * radius * height;
    }

    @Override
    public String toString() {
        return "The " + getOrigin() + " " + getFlavour() + " has volume " + getVolume();
    }

    public void PrintBaravelliDim() {
        System.out.println("radius = " + radius + ", height = " + height);
    }
}
