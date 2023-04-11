package WorkingFiles;

import FamilyTrees.FamilyTree;

public interface InOutFiles {
     FamilyTree loadFile(String str);
      void saveFile(FamilyTree familyTree, String str);
}
