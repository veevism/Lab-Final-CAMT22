package lab.lab14_1301;

public class Bicycle {
    private int speed;
    public int limit = 99;

    public Bicycle() {
        this.speed = 0;
    }

    public Bicycle(int speed) {
        this.speed = speed;

    }

    public void speedUp(int increment) {
        speed += increment;

        if (speed > limit) {
            this.speed = limit;
        }
    }

    public void applyBrake(int decrement) {
        speed -= decrement;

        if (speed < 0) {
            this.speed = 0;
        }
    }

    public int getSpeed() {
        return speed;
    }

}
