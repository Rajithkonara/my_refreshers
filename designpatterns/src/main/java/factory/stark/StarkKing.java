package factory.stark;

import factory.King;

/**
 * Created by rajith on 7/15/18.
 */
public class StarkKing implements King {

    static final String NAME = "John snow";

    static final String DESCRIPTION = "This is the North";

    public String getName() {
        return NAME;
    }

    public String getDescription() {
        return DESCRIPTION;
    }
}
