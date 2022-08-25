package command.simpleremote;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-09-04
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}
