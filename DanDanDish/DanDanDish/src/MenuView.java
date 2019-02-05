import java.awt.*;
import java.util.Scanner;

public class MenuView {

    public MenuView() {

        Scanner sc = new Scanner(System.in);
        Game game;
        int option;
        do {
            System.out.println("Choose an option[1-2]\n" +
                    "1. New Game\n" +
                    "2. Exit");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    game = new Game();
                    game.introP1Name();
                    game.introP2Name();
                    do {
                        game.play();
                    }while ((!game.player2Dead()) && (!game.player1Dead()));

                    break;
                case 2:
                    System.out.println("Exiting game...");
                    break;
            }
        } while (option != 2);
    }
}
