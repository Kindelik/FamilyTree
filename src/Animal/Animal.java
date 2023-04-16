package Animal;

import java.time.LocalDate;
import java.util.List;

public  interface Animal<E> {


      int getId();

     String getFirstName();

     String getLastname();


     LocalDate getDateOfBirth();

    LocalDate getDateOfDeath();

    abstract Animal getMather();

     abstract Animal getFather();

     List<E> getChildrens();


      String getSex();

    void addChildren(Animal animal);
}
