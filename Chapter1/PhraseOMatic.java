package Chapter1;

/**
 * Created by burak on 02.10.15.
 */
public class PhraseOMatic {

    public static void main (String [] args) {

        //make thre sets of words to choose from. Add your own!
        String [] wordListOne   = {"24/7","multi-Tier","30,000 foot","B-to-B","win-win","front-end","web-based","pervasive","smart","six-sigma","crtical-path","dynamic"};
        String [] wordListTwo   = {"empowered","sticky","value-added","oriented","centric","distributed","clustered","branded","outside-the-box","positioned","networked","focused","leveraged","aligned","targeted","shared","cooperative","accelerated"};
        String [] wordListThree = {"process","tipping-point","solution","architecture","core competency","strategy","mindshare","portal","space","vision","paradigm","mission"};

        //find out how many words are in each list
        int oneLength   = wordListOne.length;
        int twoLength   = wordListTwo.length;
        int threeLength = wordListThree.length;

        //generate thre random numbers
        int rand1 = (int) (Math.random()* oneLength);
        int rand2 = (int) (Math.random()* twoLength);
        int rand3 = (int) (Math.random()* threeLength);

        //now build a phrase2
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        //Print out phrase
        System.out.println("What we need is a " + phrase);
    }
}
