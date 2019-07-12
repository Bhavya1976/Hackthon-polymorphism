public class BMW extends Car{

    public BMW(String name, int numberOfCylinders) {
        super(name, numberOfCylinders);
    }

    @Override
    public void startEngine(){
        System.out.println("BMW Engine Started");
    }

    @Override
    public void accelerate() {
        System.out.println("BMW accelerated");
    }

    @Override
    public void applyBreak() {
        System.out.println("Break applied for BMW");
    }
}
