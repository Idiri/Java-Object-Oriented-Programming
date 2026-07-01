class SmartSpeaker extends Device implements Connectable, Adjustable{
    private int volume;

    public SmartSpeaker(String brand){
        super(brand);
    }

    public void adjustSettings(int value){
        this.volume = value;
    };
    public void connectToWifi(){
        System.out.println("Speaker connected to 5G.");
    };
    @Override
    public void displayStatus() {
        if(isOn){
            System.out.println("The device is ON" + "\n The volume is " + volume);
        }
        else{
            System.out.println("The device is OFF" + "\n The volume is " + volume);
        }
}
}