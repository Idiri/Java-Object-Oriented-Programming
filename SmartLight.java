class SmartLight extends Device implements Adjustable{

    private int brightness;

    public SmartLight(String brand){
        super(brand);
    }

    public void adjustSettings(int value) {
        this.brightness = value;
    }

    @Override
    public void displayStatus() {
        if(isOn){
            System.out.println("Light is at " + brightness + " brightness");
        }
        else{
            System.out.println("Light is OFF");
        }
    }

    
}