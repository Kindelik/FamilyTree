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
        //String[] temp = human.get(2).split(",");
        service.addHuman(human.get(0), human.get(1), LocalDate.of(1994,04,24), Sex.valueOf(human.get(3)));
        System.out.println("Человек добавлен");
    }

}
