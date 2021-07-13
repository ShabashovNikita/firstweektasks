package secondtask;

public class Company {
    private Gamer[] gamers;

    public Company(Gamer[] gamers) {
        this.gamers = gamers;
    }

    public Gamer getRoundWinner(Gamer previousWinner, int K) {
        Gamer winner = previousWinner;
        int maxSum = previousWinner.throwCube(K);

        for (Gamer gamer : gamers) {
            if (!gamer.equals(previousWinner)){
                int sum = gamer.throwCube(K);
                if (sum > maxSum) {
                    winner = gamer;
                    maxSum = sum;
                }
            }
        }
        winner.incrementNumberOfVictories();
        return winner;
    }

    public Gamer getRoundWinner(int K){
        return getRoundWinner(gamers[0], K);
    }
}
