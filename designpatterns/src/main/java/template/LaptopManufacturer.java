package template;

public class LaptopManufacturer extends ComputerManufacturer {

    @Override
    public void addHardDisk() {
        System.out.println("Laptop hard disk added");
    }

    @Override
    public void addRAM() {
        System.out.println("Laptop ram added");
    }

    @Override
    public void addKeyBoard() {
        System.out.println("Laptop key board added");
    }
}
