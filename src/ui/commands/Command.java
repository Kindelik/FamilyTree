package ui.commands;

import Services.Service;
import ui.Console;

public abstract class Command implements Option {
    private final Console console;

    public Command(Console console) {
        this.console = console;
    }

    public Console getConsole() {
        return console;
    }
}