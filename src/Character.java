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

    // ����� ����� ��������� (��������)
    void attack(Character character) {
        int x;
        String hit = "�������";
        // ����������� ��������� �����
        if (agility * 3 + level >= (int) (Math.random() * 100)) {
            x = 1;
            // ������� ���� � ������������ 20%
            if ((int) (Math.random() * 5) == 4) {
                x = 2;
                hit = "�������";
            }
            System.out.println(name + " ����� " + hit + " ���� � " + strong * x + " ������!");
            character.setHealth(character.getHealth() - strong * x);
        }
        // ����� ������
        else {
            x = 0;
            System.out.println(name + " �����������");
        }
        System.out.println("� " + character.getName() + " �������� " + character.getHealth() + " ������ ��������!");
    }
}
