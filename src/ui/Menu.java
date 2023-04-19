package ui;

import ui.commands.*;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private final List<Option> commands;
    private final Console console;

    public Menu(Console console) {
        this.console = console;
        commands = new ArrayList<>();
        commands.add(new AddHuman(console));
        commands.add(new SearchHuman(console));
        commands.add(new DelHuman(console));
        commands.add(new ShowList(console));
        commands.add(new Loadlist(console));
        commands.add(new SaveList(console));
        commands.add(new Exit(console));
    }

    public int menuSize(){
        return commands.size();
    }

    void execute(int num){
        Option option = commands.get(num-1);
        option.execute();
    }
    public String printMenu(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < commands.size(); i++) {
            stringBuilder.append(i+1);
            stringBuilder.append(": ");
            stringBuilder.append(commands.get(i).description());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
