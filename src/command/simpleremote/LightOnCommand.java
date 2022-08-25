package command.simpleremote;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-09-04
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
