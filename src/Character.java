abstract class Character {
    String name;
    int health;
    int strong;
    int agility;

    int level;

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrong(int strong) {
        this.strong = strong;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    int gold;
    int experience;

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getStrong() {
        return strong;
    }

    public int getAgility() {
        return agility;
    }

    public int getGold() {
        return gold;
    }

    public int getExperience() {
        return experience;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Character(String name, int health, int strong, int agility, int gold, int experience, int level) {
        this.name = name;
        this.health = health;
        this.strong = strong;
        this.agility = agility;
        this.gold = gold;
        this.experience = experience;
        this.level = level;
    }

    // метод атаки персонажа (существа)
    void attack(Character character) {
        int x;
        String hit = "обычный";
        // вероятность нанесения удара
        if (agility * 3 + level >= (int) (Math.random() * 100)) {
            x = 1;
            // Двойной удар с вероятностью 20%
            if ((int) (Math.random() * 5) == 4) {
                x = 2;
                hit = "двойной";
            }
            System.out.println(name + " нанес " + hit + " удар в " + strong * x + " единиц!");
            character.setHealth(character.getHealth() - strong * x);
        }
        // иначе промах
        else {
            x = 0;
            System.out.println(name + " промахнулся");
        }
        System.out.println("У " + character.getName() + " осталось " + character.getHealth() + " единиц здоровья!");
    }
}
