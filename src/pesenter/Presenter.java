package pesenter;

import Services.Service;
import Sex.Sex;
import ui.View;

import java.util.List;
import java.util.Objects;

public class Presenter {
    private final View view;
    private final Service service;



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
        if (service.loadFamilyGroup(nameFile)) view.print("Загружено");
        else view.print("Ошибка загрузки");
    }

    public void showList(){
        if(Objects.isNull(service)){
            view.print("Список пустой");
        }
        view.print(service.getFamilyGroup().toString());
    }

    public void saveList(String nameFile) {
        if(service.saveFamilyGroup(nameFile)) view.print("Сохранено");
        else view.print("Ошибка сохранения");
    }
}
