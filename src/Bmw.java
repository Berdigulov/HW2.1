public class Bmw extends Car {
    private double volume;
    private int year;

    public Bmw(String name, double volume, int year) {
        super(name);
        this.volume = volume;
        this.year = year;
    }

    public double getVolume() {
        return volume;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void print() {
        System.out.println("Name of vehicle: "+ getName() + "\nVolume: " + volume + "\nYear: " + year);
    }
}
