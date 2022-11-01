import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ������ ����
        System.out.println("������� ��� ������:");
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        Player player = new Player(playerName);
        // ����� �������
        chooseLocation(player);

    }

    // ����� � ��������
    private static void goToTrader(Player player) {
        Trader trader = new Trader();
        trader.trade(player);
        chooseLocation(player);
    }

    // ����� � ������ ���
    private static void goToWood(Player player) {
        Battle battle = new Battle(player);
        battle.start();
    }

    // ����� ������� � ������
    public static void chooseLocation(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("���� �� ������ �����?");
        System.out.println("1. � ��������");
        System.out.println("2. � ������ ���");
        System.out.println("3. �� �����");
        int location = scanner.nextInt();
        switch (location) {
            case 1 -> goToTrader(player);
            case 2 -> goToWood(player);
            case 3 -> System.out.println("Exit");
        }
    }

}