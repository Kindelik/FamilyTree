import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        FamilyTree test = new FamilyTree();
        Human humanOne = new Human("Андрей", "Пивоваров", "1974-11-21", Sex.male);
        Human humanTwo = new Human("Мария", "Белова", "1975-06-15", Sex.female);
        Human humanThree = new Human("Артем", "Пивоваров", "2000-03-08", Sex.male, humanTwo, humanOne);
        Human humanFour = new Human("Кристина", "Вротмненоговна", "2003-01-27", Sex.female);
        Human humanFive = new Human("Алина", "Пивоварова", "2023-08-18", Sex.female, humanFour, humanThree);
        test.add(humanOne);
        test.add(humanTwo);
        test.add(humanThree);
        test.add(humanFour);
        test.add(humanFive);

        FamilyTree testNull = new FamilyTree();
        inOutSerialObject.loadFile();


       // StringBuilder sb = humanThree.getHumanInfoTXT();
       // System.out.println(humanThree.getChildrens());
       // System.out.println(sb);

    }
}

