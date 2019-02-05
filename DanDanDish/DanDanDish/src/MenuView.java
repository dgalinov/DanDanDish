import java.awt.*;
import java.util.Scanner;

public class MenuView {

    public MenuView() {

        Scanner sc = new Scanner(System.in);
        Game game;
        Player player1 = new Player();
        Player player2 = new Player();
        int option;
        do {
            System.out.println("Choose an option[1-2]\n" +
                    "1. New Game\n" +
                    "2. Exit");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    game = new Game(player1, player2);
                    game.introPlayerName(player1);
                    game.introPlayerName(player2);

                    do {
                        game.play();
                    }while ((!game.playerIsDead(player1)) && (!game.playerIsDead(player2)));

                    break;
                case 2:
                    System.out.println("Exiting game...");
                    break;
            }
        } while (option != 2);
    }
}
