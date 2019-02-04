package facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DwarvenCartOperator extends DwarvenMineWorker {

    private static final Logger LOGGER = LoggerFactory.getLogger(DwarvenCartOperator.class);

    public void work() {
        LOGGER.info("{} moves gold chunks out of the mine.", name());
    }

    public String name() {
        return "Dwarf cart operator";
    }
}
