public class Plane extends vehicles{

    private int altitude;
    private double fuelLevel;
    private boolean isFlying;

    @Override
    public void drive(){
        System.out.println("The plane is soaring through the clouds at "+ altitude + " feet!");
    }

    public Plane(int altitiude, double fuelLevel, boolean isFlying){
        super("Plane");
        this.altitude = altitiude;
        this.fuelLevel = fuelLevel;
        this.isFlying = isFlying;
    }

    public void takeOff(){
        if(!isFlying){
        System.out.println("The plane has taken off");
        isFlying = true;

        }
    }
    public void land(){
        if(isFlying){
        System.out.println("The plane has landed");
        isFlying = false;
        altitude = 0;
        }
    }
    public void refuel(){
        System.out.println("The plane is refueling.");
        this.fuelLevel = 100.0;
    }

    public int getAltitude(){ return altitude; }
    public double getFuelLevel(){ return fuelLevel; }
    public boolean isFlying(){ return isFlying; }

}