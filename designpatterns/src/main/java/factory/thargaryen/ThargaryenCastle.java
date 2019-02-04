package factory.thargaryen;

import factory.Castle;

/**
 * Created by rajith on 7/15/18.
 */
public class ThargaryenCastle implements Castle {

    static final String NAME = "Dragonstone";

    public String getName() {
        return NAME;
    }

    public String getDescription() {
        return null;
    }
}
