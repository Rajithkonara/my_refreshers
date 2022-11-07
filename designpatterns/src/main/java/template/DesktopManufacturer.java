package template;

public class DesktopManufacturer extends ComputerManufacturer {

    @Override
    public void addHardDisk() {
        System.out.println("Computer hard disk added");
    }

    @Override
    public void addRAM() {
        System.out.println("Computer ram added");
    }

    @Override
    public void addKeyBoard() {
        System.out.println("Computer key board added");
    }
}
