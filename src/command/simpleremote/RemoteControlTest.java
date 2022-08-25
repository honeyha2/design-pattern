package command.simpleremote;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-09-04
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        Command lightOnCommand = new LightOnCommand(light);
        Command garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        simpleRemoteControl.setSlot(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();
        simpleRemoteControl.setSlot(garageDoorOpenCommand);
        simpleRemoteControl.buttonWasPressed();
    }
}
