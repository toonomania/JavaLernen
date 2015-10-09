package Chapter2;

/**
 * Created by burak on 05.10.15.
 */
public class MovieTestDrive {

    public static void main (String [] args) {

        Movie one = new Movie();
        one.title = "gone with the Stock";
        one.genre = "Tragic";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "Lost in Cublicle Space";
        two.genre = "Comedy";
        two.rating = 5;
        two.playIt(2);
        Movie three = new Movie();
        three.title = "Byte Club";
        three.genre = "Tragic but ultimately uplifting";
        three.rating = 127;
    }
}
