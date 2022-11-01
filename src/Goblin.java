public class Goblin extends Character {

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public int getStrong() {
        return super.getStrong();
    }

    @Override
    public int getAgility() {
        return super.getAgility();
    }

    @Override
    public int getGold() {
        return super.getGold();
    }

    @Override
    public int getExperience() {
        return super.getExperience();
    }

    public Goblin() {
        super("Goblin", 70, 8, 10, 0, 0, 1);
    }

    @Override
    void attack(Character character) {
        super.attack(character);
    }
}
