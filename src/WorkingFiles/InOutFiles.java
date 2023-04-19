package WorkingFiles;

import FamilyTrees.FamilyTree;

import java.io.FileNotFoundException;

public interface InOutFiles {
     FamilyTree loadFile(String str);
      boolean saveFile(FamilyTree familyTree, String str);
}
