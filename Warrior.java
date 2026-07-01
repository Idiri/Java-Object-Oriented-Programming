public class Warrior extends GameCharacter implements Healable{
    
    private int strength;


    public Warrior(String name, int level, double health, int strength){

        super(name, level, health);
        this.strength = strength;


    }
    @Override
    public void heal(int amount){
        setHealth(getHealth() + amount);
        System.out.println(getName() + " restored " + amount + " health! Current health is: " + getHealth());
    }

    @Override
    public void performAction(){
        System.out.println(getName() + " swings a massive sword!");
    }

    public int getStrength(){ return strength; }

    
}