import java.util.Random;

public class GuessGame {

    private GuessPlayer p1;
    private GuessPlayer p2;
    private GuessPlayer p3;

    public void startGame() {
        this.p1 = new GuessPlayer("Munchlax");
        this.p2 = new GuessPlayer("Charmander");
        this.p3 = new GuessPlayer("Charizard");

        Random rand = new Random();
        int bound = 101;
        int randomNumber = rand.nextInt(11);

        boolean p1Right = false;
        boolean p2Right = false;
        boolean p3Right = false;
        while(true) {
            System.out.println("random number is "+randomNumber);
            p1.guess(bound);
            p2.guess(bound);
            p3.guess(bound);

            System.out.println(p1.getNumber());
            System.out.println(p2.getNumber());
            System.out.println(p3.getNumber());

            if(p1.getNumber() == randomNumber) {
                p1Right = true;
            }
            if(p2.getNumber() == randomNumber) {
                p2Right = true;
            }
            if(p3.getNumber() == randomNumber) {
                p3Right = true;
            }

            if(p1Right || p2Right || p3Right) {
                System.out.println("We have a winner!!!! ");
                System.out.println(p1.getName() + " has nailed or not? "+p1Right);
                System.out.println(p2.getName() + " has nailed or not? "+p2Right);
                System.out.println(p3.getName() + " has nailed or not? "+p3Right);
                break;
            }else {
                System.out.println("Time to play again");
            }


        }


    }

}
