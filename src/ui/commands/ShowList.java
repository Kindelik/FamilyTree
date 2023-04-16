package ui.commands;

import ui.Console;

public class ShowList extends Command{
    public ShowList(Console console) {
        super(console);
    }
    @Override
    public String description() {
        return "Вывести список объектов";
    }

    @Override
    public void execute() { getConsole().showList();

    }
}
