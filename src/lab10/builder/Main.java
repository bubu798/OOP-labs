package lab10.builder;

public class Main {
    public static void main(String[] args) {
        House house = new House.HouseBuilder("LA", 3, 1)
                .wifi(1)
                .solarPanels(0)
                .pool(0)
                .build();

        System.out.println(house);
    }
}
