package ui.commands;

import ui.Console;

public class DelHuman extends Command {

    public DelHuman(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Удалить человека";
    }

    @Override
    public void execute() {
        getConsole().delHuman();
    }
}

