package Chapter2;

/**
 * Created by burak on 05.10.15.
 */
public class GuessGame {
    // Instance Variables for three Player objects
    Player p1;
    Player p2;
    Player p3;
    // create Thre Player objects ad assign them to the instance variabes
    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        //Variables for holding the guesses
        int guess1 = 0;
        int guess2 = 0;
        int guess3 = 0;
        // boolean variables if the player guessed right
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        //making the number which has to be quessed
        int targetNumber = (int) (Math.random() *10);
        System.out.println("I'm thinking a number between 0 and 9...");

        while(true) {
            System.out.println("Number to guess is " + targetNumber);
            // call each Players guess() Method
            p1.guess();
            p2.guess();
            p3.guess();
            // Getting each Guess by accessing there number variable
            guess1 = p1.number;
            System.out.println("Player one guess " + guess1);

            guess2 = p2.number;
            System.out.println("Player two guess " + guess2);

            guess3 = p3.number;
            System.out.println("Player three guess " + guess3);

            if ( guess1 == targetNumber) {
                p1isRight = true;
            }
            if ( guess2 == targetNumber) {
                p2isRight = true;
            }
            if ( guess3 == targetNumber) {
                p3isRight = true;
            }
            // If anyone has guessed right
            if (p1isRight || p2isRight || p3isRight) {

                System.out.println("We have a winner");
                System.out.println("Player one got it right? " +   p1isRight);
                System.out.println("Player two got it right? " +   p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                break;
            }
            else {
                System.out.println("Players have to try again.");
            }
        }
    }
}
