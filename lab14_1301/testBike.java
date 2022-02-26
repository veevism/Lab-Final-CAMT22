package lab.lab14_1301;

import java.util.Random;

public class testBike {
    public static void main(String[] args) {

        Random rand = new Random();

        System.out.println("Normal Bike : ");
        Bicycle bike1 = new Bicycle(20);
        bike1.speedUp(rand.nextInt(99));
        System.out.println(bike1.getSpeed());
        bike1.speedUp(rand.nextInt(99));
        System.out.println(bike1.getSpeed());
        bike1.speedUp(rand.nextInt(99));
        System.out.println(bike1.getSpeed());
        bike1.speedUp(rand.nextInt(99));
        System.out.println(bike1.getSpeed());
        bike1.speedUp(rand.nextInt(99));
        System.out.println(bike1.getSpeed());

        bike1.applyBrake(rand.nextInt(99));
        System.out.println(bike1.getSpeed());
        bike1.applyBrake(rand.nextInt(99));
        System.out.println(bike1.getSpeed());
        bike1.applyBrake(rand.nextInt(99));
        System.out.println(bike1.getSpeed());
        bike1.applyBrake(rand.nextInt(99));
        System.out.println(bike1.getSpeed());
        bike1.applyBrake(rand.nextInt(99));
        System.out.println(bike1.getSpeed());

        System.out.println("Mountain Bike : ");
        MountainBike moubike1 = new MountainBike(20, 1);
        moubike1.speedUp(rand.nextInt(99));
        System.out.println(moubike1.getSpeed());
        moubike1.speedUp(rand.nextInt(99));
        System.out.println(moubike1.getSpeed());
        moubike1.speedUp(rand.nextInt(99));
        System.out.println(moubike1.getSpeed());
        moubike1.speedUp(rand.nextInt(99));
        System.out.println(moubike1.getSpeed());
        moubike1.speedUp(rand.nextInt(99));
        System.out.println(moubike1.getSpeed());

        moubike1.applyBrake(rand.nextInt(99));
        System.out.println(moubike1.getSpeed());
        moubike1.applyBrake(rand.nextInt(99));
        System.out.println(moubike1.getSpeed());
        moubike1.applyBrake(rand.nextInt(99));
        System.out.println(moubike1.getSpeed());
        moubike1.applyBrake(rand.nextInt(99));
        System.out.println(moubike1.getSpeed());
        moubike1.applyBrake(rand.nextInt(99));
        System.out.println(moubike1.getSpeed());

    }
}
