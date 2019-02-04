package factory.thargaryen;

import factory.King;

/**
 * Created by rajith on 7/15/18.
 */
public class ThargaryenKing implements King {

    static final String NAME = "Daenerys Targaryen ";

    static final String DESCRIPTION = "Mother of Dragons";

    public String getName() {
        return NAME;
    }

    public String getDescription() {
        return DESCRIPTION;
    }
}
