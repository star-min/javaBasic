package Command;

public class LightOnCommand implements Command {
    Lights light;

    public LightOnCommand(Lights light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}