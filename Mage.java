public class Mage extends GameCharacter implements Healable{
    
    int mana;
    
    @Override
    public void heal(int amount){
        this.health += amount;
        System.out.println(name + " restored " + amount + " health! Current health is: " + health);
    }

    @Override
    void performAction(){
        System.out.println(name + " casts a fireball!");
    }

    Mage(String name, int level, double health, int mana){
        super(name, level, health);
        this.mana = mana;
    }
    
}