package facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DwarvenGoldDigger extends DwarvenMineWorker {

    private static final Logger LOGGER = LoggerFactory.getLogger(DwarvenGoldDigger.class);

    public void work() {
        LOGGER.info("{} digs for gold.", name());
    }

    public String name() {
        return "Dwarf gold digger";
    }
}
