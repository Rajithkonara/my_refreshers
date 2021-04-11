package factory;

import factory.util.KingdomType;

/**
 * Created by rajith on 7/15/18.
 */
public class Got {

    public static void main(String[] args) {

        Kingdom kingdom = new Kingdom();

        System.out.println("==========Initializing Stark=================");
        kingdom.createKingdoms(KingDomBuilderFactory.getInstance().buildKingdom(KingdomType.STARK));
        System.out.println(kingdom.getKing().getName());
        System.out.println(kingdom.getKing().getDescription());
        System.out.println(kingdom.getCastle().getName());
        System.out.println(kingdom.getArmy().getDescription());

        System.out.println();

        System.out.println("==========Initializing Dragons=================");
        kingdom.createKingdoms(KingDomBuilderFactory.getInstance().buildKingdom(KingdomType.TARGARYEN));
        System.out.println(kingdom.getKing().getName());
        System.out.println(kingdom.getKing().getDescription());
        System.out.println(kingdom.getCastle().getName());
        System.out.println(kingdom.getArmy().getDescription());
    }
}
