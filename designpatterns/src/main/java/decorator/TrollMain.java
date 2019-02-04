package decorator;

/**
 * Created by rajith on 7/22/18.
 */
public class TrollMain {

    public static void main(String[] args) {
        // simple troll
        Troll troll = new SimpleTroll();
        troll.attack(); // The troll tries to grab you!
        troll.fleeBattle(); // The troll shrieks in horror and runs away!

        // change the behavior of the simple troll by adding a decorator
        troll = new ClubbedTroll(troll);
        troll.attack(); // The troll tries to grab you! The troll swings at you with a club!
        troll.fleeBattle(); // The troll shrieks in horror and runs away!
    }
}
