import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class inOutSerialObject implements Serializable {
/** Не работает*/
    public static void  loadFile() {
        FamilyTree familyTree = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("FamList.dat"))) {
            familyTree = (FamilyTree) ois.readObject();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(familyTree);
    }

    public static void saveFile(FamilyTree familyTree) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("FamList.dat"))) {
          oos.writeObject(familyTree);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}


