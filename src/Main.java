public class Main {
    public static void main(String[] args) {
        createObject("Audi").print();
        System.out.println("-----------------------------------");
        createObject("Bmw").print();
        System.out.println("-----------------------------------");
        createObject("Mercedes").print();


    }
    public static Car createObject(String className){
        switch (className){
            case "Audi":
                Audi audi = new Audi("Audi A6",200,"V8");
                return audi;

            case "Bmw":
                Bmw bmw = new Bmw("BMW M5",6.0,2019);
                return bmw;

            case "Mercedes":
                Mercedes mercedes = new Mercedes("Mercedes","S500",4);
                return mercedes;

        }
        return null;
    }
}