package secondtask;

public class main {
    public static void main(String[] args) {
        Game game = new Game(5, 7);
        Gamer winner = game.getWinner();
        System.out.println(winner.getName());
    }
}
