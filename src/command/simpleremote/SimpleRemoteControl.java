package command.simpleremote;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-09-04
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {

    }

    public Command getSlot() {
        return slot;
    }

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
