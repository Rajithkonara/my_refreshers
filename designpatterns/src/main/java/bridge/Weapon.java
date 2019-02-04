package bridge;

/**
 * Created by rajith on 10/20/18.
 */
public interface Weapon {

    void wield();

    void swing();

    void unwield();

    Enchantment getEnchantment();
}
