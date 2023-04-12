package ui.commands;

import ui.Console;

public class SearcHuman extends Command {

    public SearcHuman(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Поиск по фамилии";
    }

    @Override
    public void execute() {
    }
}

