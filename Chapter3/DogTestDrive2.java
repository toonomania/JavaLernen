package Chapter3;

/**
 * Created by burak on 23.10.15.
 */
public class DogTestDrive2 {

    public static void main (String [] args) {
        Dog one = new Dog();
        one.size = 70;
        Dog two = new Dog();
        two.size = 8;
        Dog three = new Dog();
        three.size = 35;

        one.bark();
        two.bark();
        three.bark();
    }
}
