import java.awt.*;
import java.util.Scanner;

public class MenuView {

    public MenuView() {

        Scanner sc = new Scanner(System.in);
        Player player1 = new Player();
        Player player2 = new Player();
        String name;
        int option = 0;
        do {
            System.out.println("Choose an option[1-2]\n" +
                    "1. New Game\n" +
                    "2. Exit");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Intro first player name: ");
                    name = sc.nextLine();
                    player1.setName(name);
                    System.out.println("Intro second player name: ");
                    name = sc.nextLine();
                    player2.setName(name);
                    Game game = new Game(player1, player2);
                    break;
                case 2:
                    System.out.println("Exiting game...");
                    break;
            }
        } while (option != 2);
    }
}
