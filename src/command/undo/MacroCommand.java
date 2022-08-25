package command.undo;

import java.util.List;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-09-04
 */
public class MacroCommand implements Command {
    List<Command> commands;

    public MacroCommand(List<Command> commands) {
        this.commands = commands;
    }

    public void execute() {
        for (int i = 0; i < commands.size(); i++) {
            commands.get(i).execute();
        }
    }

    public void undo() {
        for (int i = commands.size() - 1; i >= 0; i--) {
            commands.get(i).undo();
        }
    }
}
