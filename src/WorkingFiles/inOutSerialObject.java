package WorkingFiles;

import FamilyTrees.FamilyTree;

import java.io.*;

public class inOutSerialObject implements InOutFiles, Serializable {

    public FamilyTree loadFile(String str) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(str))) {
            FamilyTree qwerty;
            qwerty = (FamilyTree) ois.readObject();
            ois.close();
            return qwerty;
        } catch (Exception ex) {
            System.out.println("ERROR - File not found");
            return null;
        }
    }



    public  boolean saveFile(FamilyTree familyTree, String str) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(str))) {
          oos.writeObject(familyTree);
          oos.close();
          return true;
        } catch (Exception ex) {
           return false;
        }
    }
}


