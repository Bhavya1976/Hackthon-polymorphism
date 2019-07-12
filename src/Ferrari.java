public class Ferrari extends Car {
    public Ferrari(String name, int numberOfCylinders) {
        super(name, numberOfCylinders);
    }

    @Override
    public void startEngine(){
        System.out.println("Ferrari Engine Started");
    }

    @Override
    public void accelerate() {
        System.out.println("Ferrari accelerated");
    }

    @Override
    public void applyBreak() {
        System.out.println("Break applied for Ferrari");
    }
}
