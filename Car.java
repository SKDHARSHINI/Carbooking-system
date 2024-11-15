public class Car implements Cloneable
{

    private char currentLoc = 'A';
    private int customerId;
    private int carId;
    private char pickupLoc;
    private char dropLoc;
    private int pickupTime;
    private int dropTime;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    public char getCurrentLoc() {
        return currentLoc;
    }

    public void setCurrentLoc(char currentLoc) {
        this.currentLoc = currentLoc;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public char getPickupLoc() {
        return pickupLoc;
    }

    public void setPickupLoc(char pickupLoc) {
        this.pickupLoc = pickupLoc;
    }

    public char getDropLoc() {
        return dropLoc;
    }

    public void setDropLoc(char dropLoc) {
        this.dropLoc = dropLoc;
    }

    public int getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(int pickupTime) {
        this.pickupTime = pickupTime;
    }

    public int getDropTime() {
        return dropTime;
    }

    public void setDropTime(int dropTime) {
        this.dropTime = dropTime;
    }

    @Override
    public String toString() {
        return "Car => Car Id = " + carId + ", Customer Id = " + customerId + ", Current Location = " + currentLoc +", Pickup Location = "
                + pickupLoc + ", Drop Location = " + dropLoc + ", Pick-up Time = " + pickupTime + ", Drop Time = " + dropTime;
    }

}
