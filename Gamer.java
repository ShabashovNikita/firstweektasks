package secondtask;

public class Gamer {
    private final String name;
    private int numberOfVictories = 0;

    public Gamer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void incrementNumberOfVictories() {
        this.numberOfVictories++;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public int throwCube(int k){
        int sum = 0;
        Cube cube = new Cube();
        for (int i = 0; i < k; i++){
            sum += cube.getNewValue();
        }
        return sum;
    }
}
