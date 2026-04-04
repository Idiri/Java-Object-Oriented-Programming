public class Car2{
    
    
    private String make = "Dodge";
    private String model = "Hellcat";
    private int year = 2025;
    private double price = 58000.99;
    private boolean isRunning = true;

    public void start(){
        isRunning = true;
        System.out.println("You start the engine");
    }
    public void stop(){
        isRunning = false;
        System.out.println("You stop the engine");
    }
    public void drive(){
        System.out.println("You drive the car " + model);
    }
    public void brake(){
        System.out.println("You break the " + model);
    }
    }

