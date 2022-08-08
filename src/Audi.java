public class Audi extends Car {
    private int speed;
    private String motor;

    public Audi(String name, int speed, String motor) {
        super(name);
        this.speed = speed;
        this.motor = motor;
    }

    public int getSpeed() {
        return speed;
    }

    public String getMotor() {
        return motor;
    }

    @Override
    public void print() {
        System.out.println("Name of vehicle: "+ getName() + "\nSpeed: " + speed + "\nMotor: "+ motor);
    }
}
