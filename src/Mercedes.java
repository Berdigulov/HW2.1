public class Mercedes extends Car{
    private String model;
    private int seats;

    public Mercedes(String name, String model, int seats) {
        super(name);
        this.model = model;
        this.seats = seats;
    }

    public String getModel() {
        return model;
    }

    public int getSeats() {
        return seats;
    }

    @Override
    public void print() {
        System.out.println("Name of vehicle: "+ getName()+"\nModel: " + model + "\nSeats: " + seats);
    }
}
