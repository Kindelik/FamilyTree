package ui.commands;

import Services.Service;
import ui.Console;

public abstract class Command implements Option {
    private Console console;
    private Service service;

    public Command(Console console) {
        this.console = console;
    }

    public Console getConsole() {
        return console;
    }
}