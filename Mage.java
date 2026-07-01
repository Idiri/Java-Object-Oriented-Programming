public class Mage extends GameCharacter implements Healable{
    
    private int mana;

    @Override
    public void heal(int amount){
        setHealth(getHealth() + amount);
        System.out.println(getName() + " restored " + amount + " health! Current health is: " + getHealth());
    }

    @Override
    public void performAction(){
        System.out.println(getName() + " casts a fireball!");
    }

    public Mage(String name, int level, double health, int mana){
        super(name, level, health);
        this.mana = mana;
    }

    public int getMana(){ return mana; }
    
}