package delegator.printers;

import delegator.Printer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HpPrinter implements Printer {

    private static final Logger LOGGER = LoggerFactory.getLogger(HpPrinter.class);

    @Override
    public void print(String message) {
        LOGGER.info("HP Printer : {}", message);
    }
}
