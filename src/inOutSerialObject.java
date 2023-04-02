import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;public class inOutSerialObject implements InOutFiles {
/** Не работает*/
    public static FamilyTree  loadFile(String str) {
        FamilyTree familyTree = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(str))) {
            familyTree = (FamilyTree) ois.readObject();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
      return familyTree;
    }

    public static void saveFile(FamilyTree familyTree,String str) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("FamList.dat"))) {
          oos.writeObject(familyTree);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}


