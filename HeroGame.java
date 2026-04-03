public class HeroGame {
    public static void main(String[] args) {

        // 1. Setup the Guild
        GameCharacter[] guild = new GameCharacter[2];
        guild[0] = new Warrior("Ragnar", 89, 100.0, 180);
        guild[1] = new Mage("Merlin", 150, 100.0, 179);

        System.out.println("--- The Adventure Begins ---");

        // 2. Run Overridden Actions
        for (GameCharacter hero : guild) {
            hero.performAction();
        }

        System.out.println("\n--- Combat and Healing ---");

        // 3. Warrior takes damage
        guild[0].takeDamage(30.0);
        System.out.println(guild[0].name + " took a hit!");

        // 4. Use the Interface (Heal)
        // We check if the object implements Healable before casting
        for (GameCharacter hero : guild) {
            if (hero instanceof Healable) {
                ((Healable) hero).heal(15);
            }
        }
    }
}