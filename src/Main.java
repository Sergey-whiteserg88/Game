import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Начало игры
        System.out.println("Введите имя игрока:");
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        Player player = new Player(playerName);
        // выбор локации
        chooseLocation(player);

    }

    // поход к торговцу
    private static void goToTrader(Player player) {
        Trader trader = new Trader();
        trader.trade(player);
        chooseLocation(player);
    }

    // поход в темный лес
    private static void goToWood(Player player) {
        Battle battle = new Battle(player);
        battle.start();
    }

    // выбор локации в городе
    public static void chooseLocation(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Куда вы хотите пойти?");
        System.out.println("1. К торговцу");
        System.out.println("2. В темный лес");
        System.out.println("3. На выход");
        int location = scanner.nextInt();
        switch (location) {
            case 1 -> goToTrader(player);
            case 2 -> goToWood(player);
            case 3 -> System.out.println("Exit");
        }
    }

}