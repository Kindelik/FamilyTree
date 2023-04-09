import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Human humanOne = new Human("Андрей", "Пивоваров", LocalDate.of(1974, 11, 21), Sex.male);
        // Human humanTwo = new Human("Мария", "Белова", LocalDate.of(1975, 6, 15), Sex.female);
        // Human humanThree = new Human("Артем", "Пивоваров", LocalDate.of(2000, 3, 8), Sex.male, humanTwo, humanOne);
        // Human humanFour = new Human("Кристина", "Вротмненоговна", LocalDate.of(2003, 1, 27), Sex.female);
        // Human humanFive = new Human("Алина", "Пивоварова", LocalDate.of(2023, 8, 18), Sex.female, humanFour, humanThree);
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
      //  for (Human item : test) {
      //      System.out.println(item);
      //  }
        System.out.println(((Human) serviceHuman.getFamilyGroup().getFamilyTree().get(1)).getChildrens());


    }
}

