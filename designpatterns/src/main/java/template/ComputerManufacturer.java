package template;

public abstract class ComputerManufacturer {

    public void buildComputer() {
        addHardDisk();
        addRAM();
        addKeyBoard();
    }

    public abstract void addHardDisk();

    public abstract void addRAM();

    public abstract void addKeyBoard();
}
