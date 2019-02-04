package bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hammer implements Weapon {

    private static final Logger LOGGER = LoggerFactory.getLogger(Hammer.class);

    private final Enchantment enchantment;

    public Hammer(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    public void wield() {
        LOGGER.info("The hammer is wielded.");
        enchantment.onActivate();
    }

    public void swing() {
        LOGGER.info("The hammer is swinged.");
        enchantment.apply();
    }

    public void unwield() {
        LOGGER.info("The hammer is unwielded.");
        enchantment.onDeactivate();
    }

    public Enchantment getEnchantment() {
        return enchantment;
    }
}
