abstract class GameCharacter{

    private String name;
    private int level;
    private double health;

    public GameCharacter(String name, int level, double health){
        this.name = name;
        this.level = level;
        this.health = health;
    }
    public abstract void performAction();

    public String getName(){ return name; }
    public double getHealth(){ return health; }
    public int getLevel() {
        return level;
    }
    protected void setHealth(double health){ this.health = health; }
    public void takeDamage(double damage){
        if(damage > 0){
            health -= damage;
        }
    }

}
