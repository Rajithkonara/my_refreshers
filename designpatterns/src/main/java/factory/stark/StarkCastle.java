package factory.stark;

import factory.Castle;

/**
 * Created by rajith on 7/15/18.
 */
public class StarkCastle implements Castle {

    static final String NAME = "Winterfell";

    public String getName() {
        return NAME;
    }

    public String getDescription() {
        return null;
    }
}
