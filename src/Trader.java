import java.util.Scanner;

public class Trader {

    public void trade(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������ " + player.getName());

        if (player.getHealth() == 100) {
            System.out.println("� ��� ��� �������� �� ���������! ��������� � ��������� ���!");
            System.out.println("��������� � �����? ��/���");
            switch (scanner.next()) {
                case "��" -> {
                    return;
                }
                case "���" -> trade(player);
            }
        }

        while (player.getHealth() < 100) {
            System.out.println("������ ������ �����? ��/���");
            switch (scanner.next()) {
                case "��" -> {
                    player.buyHealth();
                    System.out.println("��������: " + player.getHealth());
                    System.out.println("������: " + player.getGold());
                    System.out.println("������ �������� � �����! ����� � ��������. �� ��������");
                    System.out.println("��������� � �����? ��/���");
                    switch (scanner.next()) {
                        case "��" -> {
                            return;
                        }
                        case "���" -> trade(player);
                    }

                }
                case "���" -> {
                    System.out.println("��. ��������� � ��������� ���");
                    System.out.println("��������� � �����? ��/���");
                    switch (scanner.next()) {
                        case "��" -> {
                            return;
                        }
                        case "���" -> trade(player);
                    }
                }
            }
        }

    }

}
