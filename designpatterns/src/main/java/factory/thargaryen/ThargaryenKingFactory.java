package factory.thargaryen;

import factory.Army;
import factory.Castle;
import factory.King;
import factory.KingdomFactory;

/**
 * Created by rajith on 7/15/18.
 */
public class ThargaryenKingFactory implements KingdomFactory {

    public King createKing() {
        return new ThargaryenKing();
    }

    public Castle createCastle() {
        return new ThargaryenCastle();
    }

    public Army createArmy() {
        return new ThargaryenArmy();
    }
}
