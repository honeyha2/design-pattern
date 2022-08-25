package command.simpleremote;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-09-04
 */
public class GarageDoorOpenCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
