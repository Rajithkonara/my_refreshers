package factory;

import factory.Util.KingdomType;
import factory.stark.StarkKingdomFactory;
import factory.thargaryen.ThargaryenKingFactory;

/**
 * Created by rajith on 7/15/18.
 */
public class KingDomBuilderFactory {

    private KingDomBuilderFactory() {
    }

    private static KingDomBuilderFactory instance;

    public static synchronized KingDomBuilderFactory getInstance() {
        if (instance == null) {
            instance = new KingDomBuilderFactory();
        }
        return instance;
    }

    public KingdomFactory buildKingdom(KingdomType type) {
        switch (type) {
            case STARK:
                return new StarkKingdomFactory();
            case TARGARYEN:
                return new ThargaryenKingFactory();
            default:
                throw new IllegalArgumentException("Not a seven Kingdoms");
        }
    }
}
