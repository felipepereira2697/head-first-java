import java.util.Random;

public class GuessPlayer {

    private String name;
    private int number;

    public GuessPlayer(String name) {
        this.name = name;
    }

    public void guess(int bound) {
        Random newRandom = new Random();
        this.number = newRandom.nextInt(bound);
        System.out.println(getName() + " is guessing...");

    }

    public String getName() {
        return this.name;
    }
    public int getNumber(){ return this.number; }

}
