package delegator.printers;

import delegator.Printer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Specialised Implementation of {@link Printer} for a Epson Printer, in
 * this case the message to be printed is appended to "Epson Printer : "
 *
 * @see Printer
 */
public class EpsonPrinter implements Printer  {

    private static final Logger LOGGER = LoggerFactory.getLogger(CanonPrinter.class);

    /**
     * {@inheritDoc}
     * @param message to be printed to the screen
     */
    @Override
    public void print(String message) {
        LOGGER.info("Epson Printer : {}", message);
    }
}
