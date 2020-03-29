package delegator;

import delegator.printers.CanonPrinter;
import delegator.printers.EpsonPrinter;
import delegator.printers.HpPrinter;

/**
 * The delegate pattern provides a mechanism to abstract away the implementation and control of the desired action.
 * The class being called in this case {@link PrinterController} is not responsible for the actual desired action,
 * but is actually delegated to a helper class either {@link CanonPrinter}, {@link EpsonPrinter} or {@link HpPrinter}.
 * The consumer does not have or require knowledge of the actual class carrying out the action, only the
 * container on which they are calling.
 * <p>
 * In this example the delegates are {@link EpsonPrinter}, {@link HpPrinter} and {@link CanonPrinter} they all implement
 * {@link Printer}. The {@link PrinterController} class also implements {@link Printer}. However neither provide the
 * functionality of {@link Printer} by printing to the screen, they actually call upon the instance of {@link Printer}
 * that they were instantiated with. Therefore delegating the behaviour to another class.
 */
public class App {

    private static final String MESSAGE_TO_PRINT = "hello world";

    public static void main(String[] args) {
        PrinterController hpPrinterController = new PrinterController(new HpPrinter());
        PrinterController canonPrinterController = new PrinterController(new CanonPrinter());
        PrinterController epsonPrinterController = new PrinterController(new EpsonPrinter());

        hpPrinterController.print(MESSAGE_TO_PRINT);
        canonPrinterController.print(MESSAGE_TO_PRINT);
        epsonPrinterController.print(MESSAGE_TO_PRINT);
    }


}
