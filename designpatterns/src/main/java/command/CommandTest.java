package command;

public class CommandTest {

    public static void main(String[] args) {

        Television television = new Television();

        RemoteControl remoteControl = new RemoteControl();

        OnCommand onCommand = new OnCommand(television);
        remoteControl.setCommand(onCommand);
        remoteControl.press();

        OffCommand offCommand = new OffCommand(television);
        remoteControl.setCommand(offCommand);
        remoteControl.press();

    }
}
