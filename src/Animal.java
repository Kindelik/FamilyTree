import java.time.LocalDate;
import java.util.List;

public  interface Animal<E> {


     default int getId() {
        return 0;
    }
     String getFirstName();

     String getLastname();


     LocalDate getDateOfBirth();

    LocalDate getDateOfDeath();

    abstract Animal getMather();

     abstract Animal getFather();

     default List<E> getChildrens() {
        return null;
    }

     default String getSex() {
        return null;
    }

    void addChildren(Animal human);
}
