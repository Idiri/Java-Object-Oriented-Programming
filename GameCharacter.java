abstract class GameCharacter{

    String name;
    private int level;
    double health;

    GameCharacter(String name, int level, double health){
        this.name = name;
        this.level = level;
        this.health = health;
    }
    abstract void performAction();

    public int getLevel() {
    return level;
}
    void takeDamage(double damage){
        if(damage > 0){
            health -= damage;
        }
    }

}
