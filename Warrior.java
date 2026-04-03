public class Warrior extends GameCharacter implements Healable{
    
    int strength;
   

    Warrior(String name, int level, double health, int strength){

        super(name, level, health);
        this.strength = strength;
        


    }
    @Override
    public void heal(int amount){
        this.health += amount;
        System.out.println(name + " restored " + amount + " health! Current health is: " + health);
    }

    @Override
    void performAction(){
        System.out.println(name + " swings a massive sword!");
    }

    
}