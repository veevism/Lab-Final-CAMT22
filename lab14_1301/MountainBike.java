package lab.lab14_1301;

public class MountainBike extends Bicycle {
    private int gear;
    public int limit = 200;

    public MountainBike() {
        this.gear = 0;
    }

    public MountainBike(int speed, int gear) {
        super(speed);
        this.gear = gear;

        if (gear > 5) {
            this.gear = 5;
        }

        if (gear < 0) {
            this.gear = 0;
        }
    }

    public void gearUp(int increment) {
        gear += increment;

        if (gear > 5) {
            this.gear = 5;
        }
    }

    public void gearDown(int decrement) {
        gear -= decrement;

        if (gear < 0) {
            this.gear = 0;
        }
    }

    public int getGear() {
        return gear;
    }

    @Override
    public void speedUp(int increment) {
        super.limit = this.limit;
        super.speedUp(increment * gear);
    }

    @Override
    public void applyBrake(int decrement) {
        super.applyBrake(decrement * gear);
    }
}
