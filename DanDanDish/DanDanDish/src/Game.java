import java.util.Scanner;

public class Game {

    private Player player1;
    private Player player2;

    Scanner sc = new Scanner(System.in);

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }


    public void play(){

        Action action1 = chooseAction(player1);
        Action action2 = chooseAction(player2);

        substractLife(action1, action2);

        System.out.println(player1.toString());
        System.out.println(player2.toString());

    }

    public boolean playerIsDead(Player player){
        return player.isDead();
    }

    public void introPlayerName(Player player){
        System.out.println("Intro player name: ");
        String name = sc.nextLine();
        player.setName(name);
    }

    public void substractLife(Action actionChoosedPlayer1, Action actionChoosedPlayer2){
        if ((actionChoosedPlayer1 == Action.SHOOT) && (actionChoosedPlayer2 == Action.LOAD)){
            player2.substractLife();
        }
        if ((actionChoosedPlayer1 == Action.LOAD) && (actionChoosedPlayer2 == Action.SHOOT)){
            player1.substractLife();
        }
        if ((actionChoosedPlayer1 == Action.SHOOT) && (actionChoosedPlayer2 == Action.SHOOT)){
            player1.substractLife();
            player2.substractLife();
        }
    }

    public Action chooseAction(Player player) {
        String actionChoosed;
        Action action;
        Action actionCase;
        do {
            System.out.println(player.getName() + " choose an action:\n" +
                    "{1}-Load\n" +
                    "{2}-Cover\n" +
                    "{3}-Shoot");
            actionChoosed = sc.nextLine();
            action = Action.valueOf(Integer.parseInt(actionChoosed));
        }while (!isValidAction(action));
        actionCase = action;
        switch (actionCase){
            case LOAD:
                player.addBullet();
                break;
            case COVER:
                player.playerCovered();
                break;
            case SHOOT:
                if (player.hasBullet()){
                    player.substractBullet();
                }
        }
        return actionCase;
    }

    public boolean isValidAction(Action action){
        if ((action == Action.LOAD) || (action == Action.COVER) || (action == Action.SHOOT)){
            return true;
        } else {
            System.out.println("Invalid Action\n");
            return false;
        }
    }
}
