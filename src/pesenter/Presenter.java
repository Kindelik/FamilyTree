package pesenter;

import Services.Service;
import Sex.Sex;
import ui.View;

import java.time.LocalDate;
import java.util.List;

public class Presenter {
    private View view;
    private Service service;



    public Presenter(View view, Service service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);
    }

    public void addHuman(List<String> human) {
        service.addHuman(human.get(0), human.get(1), human.get(2), Sex.valueOf(human.get(3)));
        view.print("Объект добавлен");
    }

    public void delHuman(int id) {
        if (service.delHumanID(id)){ view.print("Объект удален");}
        else view.print("Удаление по этому ID невозможно");
    }

    public void searchHuman(String lastName) {
           view.print(service.searchHuman(lastName).toString());

    }
    public void loadList(String nameFile){
        service.loadFamilyGroup(nameFile);
        view.print("Загружено");
    }

    public void showList(){
        view.print(service.getFamilyGroup().toString());
    }


}
