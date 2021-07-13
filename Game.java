package secondtask;

public class Game {
    private final int N;
    private final int K;

    public Game(int n, int k) {
        N = n;
        K = k;
    }

    public Gamer getWinner() {
        Gamer[] gamers = new Gamer[N];
        for (int i = 0; i < N; i++) {
            gamers[i] = new Gamer("Gamer" + i);
        }
        Company company = new Company(gamers);
        Gamer winner = company.getRoundWinner(K);
        while (winner.getNumberOfVictories() < 7) {
            winner = company.getRoundWinner(winner, K);
        }
        return winner;
    }
}
