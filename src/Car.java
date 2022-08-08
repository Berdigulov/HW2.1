public abstract class Car implements Printable{
    private String className;

    public Car(String name) {
        this.className = name;
    }

    public String getName() {
        return className;
    }

}
