/**
 * Created by guber on 07.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        RocketBike rocketBike = new RocketBike(2, 5, 0, 3);

        System.out.println("Your fuel level: " + rocketBike.getFuel());
        rocketBike.fuelBike(5);
        System.out.println("Your fuel level: " + rocketBike.getFuel());

        System.out.println("Start speed: " + rocketBike.getSpeed());
        rocketBike.speedUp(40);
        System.out.println("Current speed: " + rocketBike.getSpeed());
        rocketBike.speedUp(40);
        System.out.println("Current speed: " + rocketBike.getSpeed());
        rocketBike.printDescription();

        Bicycle bike = new RocketBike(3, 4, 8, 4);
        bike.printDescription();
    }
}
