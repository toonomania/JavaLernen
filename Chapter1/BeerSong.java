package Chapter1;

/**
 * Created by burak on 02.10.15.
 */
public class BeerSong {

    public static void main (String [] args) {

        int bottles = 99;

        while (bottles > 0) {
            if (bottles > 1) {
                System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
                System.out.print("Take one down and pass it around, ");
                bottles = bottles - 1;
                System.out.println(bottles + " bottles of beer on the wall");
                System.out.println();
            }
            else {
                System.out.println(bottles + " bottle of beer on the wall, " + bottles + " bottle of beer.");
                System.out.println("Take one down and pass it around, no more bottles of beer on the wall");
                bottles = bottles - 1;
                System.out.println();
            }
        }
        System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
        System.out.println("Go to the store and buy soe more, 99 bottles of beer on the wall.");

    }
}
