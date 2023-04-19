package ui;

import Sex.Sex;
import pesenter.Presenter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Console implements View {
    private Scanner scanner;
    private Presenter presenter;
    private Menu menu;
    private boolean work;


    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void start() {
        scanner = new Scanner(System.in);
        menu = new Menu(this);
        work = true;
        while (work) {
            hello();
            String command = scanner.nextLine();
            if (checkInput(command)) {
                menu.execute(Integer.parseInt(command));
            } else {
                System.out.println("\nВыбери правильную команду\n");
            }
        }

    }

    private boolean checkInput(String text) {
        return text.matches("[0-9]") & Integer.parseInt(text) <= menu.menuSize();
    }

    private void hello() {
        System.out.println(menu.printMenu());
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }

    public void finish() {
        work = false;
    }

    public void addhuman() {
        System.out.println("Введите имя");
        String firstName = scanner.nextLine();
        System.out.println("Введите фамилию");
        String lastName = scanner.nextLine();
        String dateOfBirth = getDateOfBirth();
        String sex = getSex();
        List<String> human = new ArrayList<>();
        Collections.addAll(human, firstName, lastName, dateOfBirth, sex);
        presenter.addHuman(human);
    }

    private String getSex() {
        System.out.println("Введите пол(male or female )");
        String sex = scanner.nextLine();
        System.out.println(Sex.valueOf(sex));
        if (!sex.equals(String.valueOf(Sex.male)) && !sex.equals(String.valueOf(Sex.female))) {
            System.out.println("Неверный ввод...");
            getSex();
        }
        return sex;
    }

    private String getDateOfBirth() {
        System.out.println("Введите дату рождения(Пример 1994-04-24)");
        String dateOfBirth = scanner.nextLine();
        if (!dateOfBirth.matches("([0-2][0-9]{3})-(0[1-9]|1[0-2])-([0-2][0-9]|3[0-1])")) {
            System.out.println("Неверный ввод...");
            getDateOfBirth();
        }
        return dateOfBirth;
    }

    public void delHuman() {
        System.out.println("Введите Id номер объекта, который хотите удалить");
        String strID = scanner.nextLine();
        try {
            int id = Integer.parseInt(strID);
            presenter.delHuman(id);
        } catch (NumberFormatException e) {
            System.out.println("Неверный ввод");
        }
    }

    public void searchHuman() {
        System.out.println("Введите Фамилию для поиска");
        String lastName = scanner.nextLine();
        presenter.searchHuman(lastName);
    }

    public void showList() {
        presenter.showList();
    }

    public void loadFile() {
        System.out.println("Введите имя файла");
        String nameFile = scanner.nextLine();
        presenter.loadList(nameFile);
    }

    public void saveList() {
        System.out.println("Введите имя файла");
        String nameFile = scanner.nextLine();
        presenter.saveList(nameFile);
    }
}
