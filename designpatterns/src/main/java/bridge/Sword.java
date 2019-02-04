package bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sword implements Weapon {

    private static final Logger LOGGER = LoggerFactory.getLogger(Sword.class);

    private final Enchantment enchantment;

    public Sword(Enchantment enchantment) {
        this.enchantment = enchantment;
    }


    public void wield() {
        LOGGER.info("The sword is wielded.");
        enchantment.onActivate();
    }

    public void swing() {
        LOGGER.info("The sword is swinged.");
        enchantment.apply();
    }

    public void unwield() {
        LOGGER.info("The sword is unwielded.");
        enchantment.onDeactivate();
    }

    public Enchantment getEnchantment() {
        return enchantment;
    }
}
