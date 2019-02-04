package factory.stark;

import factory.Army;

/**
 * Created by rajith on 7/15/18.
 */
public class StarkArmy implements Army {

    static final String DESCRIPTION = "Winter is here !";

    public String getDescription() {
        return DESCRIPTION;
    }
}
