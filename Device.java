abstract class Device{
    private String brand;
    protected boolean isOn;

    Device(String brand){
        this.brand = brand;
        this.isOn = false;
    }

    public void powerButton(){
        this.isOn = !this.isOn;
    }
    abstract void displayStatus();


}