import java.util.Scanner;

public class Battle extends Thread {
    private Player player;

    public Battle(Player player) {
        this.player = player;
    }
    // определение случайного монстра 50/50
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
        // запуск битвы
        battle(player, monster);
    }
    // метод битвы
    private void battle(Player player, Character monster) {
                int i = 1;
                while (player.getHealth() > 0 && monster.getHealth() > 0) {
                    System.out.println("--- Ход: " + i + " ---");
                    if (i % 2 == 1) player.attack(monster);
                    else monster.attack(player);
                    i++;
                }
                // если выигрывает игрок
                if (player.getHealth() > 0) {
                    int experience = 100;
                    int gold = 5;
                    int strong = 1;
                    if (monster.getName().equals("Goblin")) {
                        experience = 200;
                        gold = 7;
                        strong = 2;
                    }
                    System.out.println("Враг побежден! Вы получаете " + experience + " очков опыта и " + gold + " золотых монет");
                    player.setExperience(player.getExperience() + experience);
                    player.setLevel((int)(player.getExperience()+1000)/1000);
                    player.setGold(player.getGold() + gold);
                    System.out.println("Сила увеличена на " + strong + "!");
                    player.setStrong(player.getStrong() + strong);
                    System.out.println("Остаток здоровья: " + player.getHealth() + " единиц!");
                    System.out.println("Уровень игрока: " + player.getLevel());
                    System.out.println("Продолжить поход? да/нет");
                    Scanner scanner = new Scanner(System.in);
                    switch (scanner.next()) {
                        case "да" -> {
                            new Battle(player).start();
                        }
                        case "нет" -> Main.chooseLocation(player);
                    }

                }
                // если побеждает монстр
                else {
                    System.out.println(player.getName() + " больше не может продолжать битву. Игра проиграна...");
                }

    }
    // старт битвы в отдельном потоке
    @Override
    public void run() {
        getRandomMonster();
    }
}
