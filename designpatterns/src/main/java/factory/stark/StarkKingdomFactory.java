package factory.stark;

import factory.Army;
import factory.Castle;
import factory.King;
import factory.KingdomFactory;

/**
 * Created by rajith on 7/15/18.
 */
public class StarkKingdomFactory implements KingdomFactory {

    public King createKing() {
        return new StarkKing();
    }

    public Castle createCastle() {
        return new StarkCastle();
    }

    public Army createArmy() {
        return new StarkArmy();
    }
}
