public class HomeMain{
    public static void main(String[] args){

        Device[] myHome = new Device[2];
        myHome[0] = new SmartLight("Philips");
        myHome[1] = new SmartSpeaker("Sonos");

        System.out.println("--- Activating Home Systems ---");

        for(Device device : myHome){
            device.powerButton();

            if(device instanceof Adjustable){
                ((Adjustable) device).adjustSettings(75);
            }
            if(device instanceof Connectable){
                ((Connectable) device).connectToWifi();
            }

            device.displayStatus();
            System.out.println("--------------------------");
        }











    }
}