import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FamilyTree testOne = new FamilyTree();
        Human humanOne = new Human("Андрей", "Пивоваров", "1974-11-21", Sex.male);
        Human humanTwo = new Human("Мария", "Белова", "1975-06-15", Sex.female);
        Human humanThree = new Human("Артем", "Пивоваров", "2000-03-08", Sex.male, humanTwo, humanOne);
        Human humanFour = new Human("Кристина", "Вротмненоговна", "2003-01-27", Sex.female);
        Human humanFive = new Human("Алина", "Пивоварова", "2023-08-18", Sex.female, humanFour, humanThree);
        testOne.add(humanOne);
        testOne.add(humanTwo);
        testOne.add(humanThree);
        testOne.add(humanFour);
        testOne.add(humanFive);

        FamilyTree testTwo = new FamilyTree();

       //  Проверка сериализации
       String nameFile = "FamList";
        inOutSerialObject.saveFile(testOne,nameFile);
       testTwo = inOutSerialObject.loadFile(nameFile);
        System.out.println(testTwo);




    }
}

