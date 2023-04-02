import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class inOutSerialObject implements InOutFiles {
/** Формат записи FamilyTree familyTree = loadFile */
    public static FamilyTree  loadFile(String str) {
        FamilyTree familyTree = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(str))) {
            familyTree = (FamilyTree) ois.readObject();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return familyTree;
    }
/** Формат записи saveFile(FamilyTree familyTree) */
    public static void saveFile(FamilyTree familyTree, String str) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(str))) {
          oos.writeObject(familyTree);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}


