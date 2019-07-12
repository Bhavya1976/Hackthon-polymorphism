public abstract class Car {


    private String name;
    private int numberOfCylinders;
    private final int wheels=4;
    private final boolean enginee=true;

    public Car(String name, int numberOfCylinders) {
        this.name = name;
        this.numberOfCylinders = numberOfCylinders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEnginee() {
        return enginee;
    }//handsteering,change gear,moving,startEnginee,stopEnginee,accelerate,brake
public abstract void startEngine();
public abstract void accelerate();
public  abstract void applyBreak();
}



