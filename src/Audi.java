public class Audi extends Car {

    public Audi(String name, int numberOfCylinders) {
        super(name, numberOfCylinders);
    }

    @Override
    public void startEngine(){
        System.out.println("Audi Engine Started");
    }

    @Override
    public void accelerate() {
        System.out.println("Audi accelerated");
    }

    @Override
    public void applyBreak() {
        System.out.println("Break applied for Audi");
    }
}
