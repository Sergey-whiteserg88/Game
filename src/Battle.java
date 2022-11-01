import java.util.Scanner;

public class Battle extends Thread {
    private Player player;

    public Battle(Player player) {
        this.player = player;
    }
    // ����������� ���������� ������� 50/50
    private void getRandomMonster() {
        Character monster = null;
        switch ((int) (Math.random() * 2)) {
            case 0 -> {
                monster = new Skeleton();
            }
            case 1 -> {
                monster = new Goblin();
            }
        }
        // ������ �����
        battle(player, monster);
    }
    // ����� �����
    private void battle(Player player, Character monster) {
                int i = 1;
                while (player.getHealth() > 0 && monster.getHealth() > 0) {
                    System.out.println("--- ���: " + i + " ---");
                    if (i % 2 == 1) player.attack(monster);
                    else monster.attack(player);
                    i++;
                }
                // ���� ���������� �����
                if (player.getHealth() > 0) {
                    int experience = 100;
                    int gold = 5;
                    int strong = 1;
                    if (monster.getName().equals("Goblin")) {
                        experience = 200;
                        gold = 7;
                        strong = 2;
                    }
                    System.out.println("���� ��������! �� ��������� " + experience + " ����� ����� � " + gold + " ������� �����");
                    player.setExperience(player.getExperience() + experience);
                    player.setLevel((int)(player.getExperience()+1000)/1000);
                    player.setGold(player.getGold() + gold);
                    System.out.println("���� ��������� �� " + strong + "!");
                    player.setStrong(player.getStrong() + strong);
                    System.out.println("������� ��������: " + player.getHealth() + " ������!");
                    System.out.println("������� ������: " + player.getLevel());
                    System.out.println("���������� �����? ��/���");
                    Scanner scanner = new Scanner(System.in);
                    switch (scanner.next()) {
                        case "��" -> {
                            new Battle(player).start();
                        }
                        case "���" -> Main.chooseLocation(player);
                    }

                }
                // ���� ��������� ������
                else {
                    System.out.println(player.getName() + " ������ �� ����� ���������� �����. ���� ���������...");
                }

    }
    // ����� ����� � ��������� ������
    @Override
    public void run() {
        getRandomMonster();
    }
}
