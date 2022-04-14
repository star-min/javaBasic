package Command;

public class RemoteControlEx {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        ChristmasTree christmasTree = null;
        Lights light = new Lights(christmasTree);

        remote.setCommand(new LightOnCommand(light));
        remote.buttonWasPressed();
        remote.setCommand(new LightOffCommand(light));
        remote.buttonWasPressed();
    }
}
