public class Main  {
    public static void main(String[] args) {
        Human humanOne = new Human("Андрей", "Пивоваров", "1974-11-21", Sex.male);
        Human humanTwo = new Human("Мария", "Белова", "1975-06-15", Sex.female);
        Human humanThree = new Human("Артем", "Пивоваров", "2000-03-08", Sex.male, humanTwo, humanOne);
        Human humanFour = new Human("Кристина", "Вротмненоговна", "2003-01-27", Sex.female);
        Human humanFive = new Human("Алина", "Пивоварова", "2023-08-18", Sex.female, humanFour, humanThree);

        FamilyTree test = new FamilyTree();
        FamilyTree testNull = new FamilyTree();
        test.add(humanOne);
        test.add(humanTwo);
        test.add(humanThree);
        test.add(humanFour);
        test.add(humanFive);
       // humanThree.addChildren(humanFive);
       // humanFour.addChildren(humanFive);
        System.out.println(humanFour.getChildrens()); 
       // saveFile(test);
      //  loadFile(testNull);

        //System.out.println(testNull);
        //System.out.println(humanThree.getChildrens());
        // System.out.println(test);
        //System.out.println(test.searchHuman("Пивоваров"));
    }
}
