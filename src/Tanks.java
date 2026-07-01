public class Tanks extends vehicles{

    private int ammoCapacity;
    private double armorThickness;
    private int weight;

    @Override
    public void drive(){
        System.out.println("The tanks is cruising through the wasteland");
    }


    public Tanks(int ammoCapacity, double armorThickness, int weight){
        super("Tank");
        this.ammoCapacity = ammoCapacity;
        this.armorThickness = armorThickness;
        this.weight =  weight;
    }

    public void emptyMag(){
        System.out.println("The tanks is shooting at the target.");
    }

    public int getAmmoCapacity(){ return ammoCapacity; }
    public double getArmorThickness(){ return armorThickness; }
    public int getWeight(){ return weight; }

}