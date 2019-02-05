import java.awt.*;
import java.util.Scanner;

public class MenuView {

    public MenuView() {

        Scanner sc = new Scanner(System.in);
        Player player1 = new Player();
        Player player2 = new Player();
        String name;
        int actionChoosed;
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
                    System.out.println(player1.getName() +" choose an action:\n" +
                            "{1}-Load\n" +
                            "{2}-Cover\n" +
                            "{3}-Shoot");
                    actionChoosed = Integer.parseInt(sc.nextLine());
                    Action act;
                    switch(act) {
                        case COVER:

                            break;
                    }
                    if (actionChoosed == 1) {

                    } else if (actionChoosed == 2) {
                        game.cover();
                    } else if (actionChoosed == 3) {
                        game.shoot();
                    } else {
                        System.out.println("This action is not available");
                    }
                    System.out.println(player2.getName() +" choose an action:\n" +
                            "{1}-Load\n" +
                            "{2}-Cover\n" +
                            "{3}-Shoot");
                    actionChoosed = Integer.parseInt(sc.nextLine());
                    break;
                case 2:
                    System.out.println("Exiting game...");
                    break;
            }
        } while (option != 2);
    }
}
