import java.util.Scanner;

public class Trader {

    public void trade(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет " + player.getName());

        if (player.getHealth() == 100) {
            System.out.println("У Вас все впорядке со здоровьем! Приходите в следующий раз!");
            System.out.println("Вернуться в город? да/нет");
            switch (scanner.next()) {
                case "да" -> {
                    return;
                }
                case "нет" -> trade(player);
            }
        }

        while (player.getHealth() < 100) {
            System.out.println("Хотите купить зелье? да/нет");
            switch (scanner.next()) {
                case "да" -> {
                    player.buyHealth();
                    System.out.println("Здоровье: " + player.getHealth());
                    System.out.println("Золото: " + player.getGold());
                    System.out.println("Теперь здоровье в норме! Удачи в сражении. До свидания");
                    System.out.println("Вернуться в город? да/нет");
                    switch (scanner.next()) {
                        case "да" -> {
                            return;
                        }
                        case "нет" -> trade(player);
                    }

                }
                case "нет" -> {
                    System.out.println("Ок. Приходите в следующий раз");
                    System.out.println("Вернуться в город? да/нет");
                    switch (scanner.next()) {
                        case "да" -> {
                            return;
                        }
                        case "нет" -> trade(player);
                    }
                }
            }
        }

    }

}
