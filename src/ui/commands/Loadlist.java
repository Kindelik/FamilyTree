package ui.commands;

import ui.Console;

public class Loadlist extends Command {
    public Loadlist(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return ("Загрузить список людей из файла BIN");
    }
    @Override
    public void execute() {getConsole().loadFile();

    }
}
