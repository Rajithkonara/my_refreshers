package factory;

/**
 * Created by rajith on 7/15/18.
 */
public interface KingdomFactory {

    King createKing();

    Castle createCastle();

    Army createArmy();
}
