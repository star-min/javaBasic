package Command;

public class LightOffCommand implements Command {
    Lights light;

    public LightOffCommand(Lights light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}