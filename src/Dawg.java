public class Dawg extends Animal{
    private int lives = 1;

    public void speak(){
        System.out.println("the dog goes woof!");
    }

    public int getLives(){ return lives; }
    public void setLives(int lives){ this.lives = lives; }

}