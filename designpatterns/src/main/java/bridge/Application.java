package bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        LOGGER.info("The knight receives an enchanted sword.");
        Sword enchantedSword = new Sword(new SoulEatingEnchantment());
        enchantedSword.wield();
        enchantedSword.swing();
        enchantedSword.unwield();

        LOGGER.info("The valkyrie receives an enchanted hammer.");
        Hammer enchantedHammer = new Hammer(new FlyingEnchantment());
        enchantedHammer.wield();
        enchantedHammer.swing();
        enchantedHammer.unwield();
    }
}
