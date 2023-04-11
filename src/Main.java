import FamilyTrees.FamilyTree;
import Humans.Human;
import Humans.Sex;
import Services.Service;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Humans.Human humanOne = new Humans.Human("Андрей", "Пивоваров", LocalDate.of(1974, 11, 21), Sex.male);
        // Humans.Human humanTwo = new Humans.Human("Мария", "Белова", LocalDate.of(1975, 6, 15), Sex.female);
        // Humans.Human humanThree = new Humans.Human("Артем", "Пивоваров", LocalDate.of(2000, 3, 8), Sex.male, humanTwo, humanOne);
        // Humans.Human humanFour = new Humans.Human("Кристина", "Вротмненоговна", LocalDate.of(2003, 1, 27), Sex.female);
        // Humans.Human humanFive = new Humans.Human("Алина", "Пивоварова", LocalDate.of(2023, 8, 18), Sex.female, humanFour, humanThree);
        FamilyTree<Human> test = new FamilyTree();
        Service serviceHuman = new Service(test);

        serviceHuman.addHuman("Андрей", "Пивоваров", LocalDate.of(1974, 11, 21), Sex.male);
        serviceHuman.addHuman("Мария", "Белова", LocalDate.of(1975, 6, 15), Sex.female);
        serviceHuman.addHuman("Артем", "Пивоваров", LocalDate.of(2000, 3, 8),
                Sex.male, (Human) serviceHuman.getFamilyGroup().getFamilyTree().get(0), (Human) serviceHuman.getFamilyGroup().getFamilyTree().get(1));
        serviceHuman.addHuman("Кристина", "Вротмненоговна", LocalDate.of(2003, 1, 27), Sex.female);
        serviceHuman.addHuman("Алина", "Пивоварова", LocalDate.of(2023, 8, 18),
                Sex.female, (Human) serviceHuman.getFamilyGroup().getFamilyTree().get(2), (Human) serviceHuman.getFamilyGroup().getFamilyTree().get(3));

        serviceHuman.sortByLastName();
       for (Humans.Human item : test) {
           System.out.println(item);
       }

        //System.out.println(((Human) serviceHuman.getFamilyGroup().getFamilyTree().get(1)).getChildrens());


    }
}

