import java.util.Scanner;

public class Game {

    Player player1 = new Player();
    Player player2 = new Player();
    String name;
    int actionChoosedPlayer1;
    int actionChoosedPlayer2;

    Scanner sc = new Scanner(System.in);

    public Game() {
    }


    public void play(){

        player1ChooseAction();

        player2ChooseAction();

        substractLife(actionChoosedPlayer1, actionChoosedPlayer2);

        System.out.println(player1.toString());
        System.out.println(player2.toString());

    }

    public boolean player1Dead(){
        return player1.isDead();
    }

    public boolean player2Dead(){
        return player2.isDead();
    }

    public void introP1Name(){
        System.out.println("Intro first player name: ");
        name = sc.nextLine();
        player1.setName(name);
    }

    public void introP2Name(){
        System.out.println("Intro second player name: ");
        name = sc.nextLine();
        player2.setName(name);
    }

    public void substractLife(int actionChoosedPlayer1, int actionChoosedPlayer2){
        if ((actionChoosedPlayer1 == 3) && (actionChoosedPlayer2 == 1)){
            player2.substractLife();
        }
        if ((actionChoosedPlayer1 == 1) && (actionChoosedPlayer2 == 3)){
            player1.substractLife();
        }
    }

    public void player1ChooseAction(){
        System.out.println(player1.getName() +" choose an action:\n" +
                "{1}-Load\n" +
                "{2}-Cover\n" +
                "{3}-Shoot");
        actionChoosedPlayer1 = Integer.parseInt(sc.nextLine());

        switch (actionChoosedPlayer1){
            case 1:
                player1.addBullet();
                break;
            case 2:
                player1.playerCovered();
                break;
            case 3:
                if (player1.hasBullet()){
                    player1.substractBullet();
                }
        }
    }

    public void player2ChooseAction(){
        System.out.println(player2.getName() +" choose an action:\n" +
                "{1}-Load\n" +
                "{2}-Cover\n" +
                "{3}-Shoot");
        actionChoosedPlayer2 = Integer.parseInt(sc.nextLine());

        switch (actionChoosedPlayer2){
            case 1:
                player2.addBullet();
                break;
            case 2:
                player2.playerCovered();
                break;
            case 3:
                if (player2.hasBullet()){
                    player2.substractBullet();
                }

        }
    }

}
