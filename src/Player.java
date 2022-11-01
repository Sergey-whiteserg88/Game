public class Player extends Character {

    public Player(String name) {
        super(name, 100, 10, 20, 50, 0,1);
    }

    @Override
    void attack(Character character) {
        super.attack(character);
    }

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

    public void buyHealth() {
        if (health < 100) {
            gold -= 10;
            if (gold <= 0) {
                System.out.println("Недостаточно денег для покупки");
                gold = 0;
            } else health = 100;
        } else System.out.println("Health Max");
    }
}
