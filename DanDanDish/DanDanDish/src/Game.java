public class Game {

    Player player1 = new Player();
    Player player2 = new Player();

    public Game(){}

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public boolean load(Action action){

        return action.equals(Action.LOAD);
    }

    public boolean shoot(Action action){
        return action.equals(Action.SHOOT);
    }

    public boolean cover(Action action){
        return action.equals(Action.COVER);
    }



}
