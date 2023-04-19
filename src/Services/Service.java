package Services;

import Animal.Animal;
import FamilyTrees.FamilyTree;
import Humans.Human;
import Sex.Sex;
import WorkingFiles.InOutFiles;
import WorkingFiles.inOutSerialObject;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Service {
    private int id;
    private FamilyTree<Animal> familyGroup;
     private final InOutFiles workFile;

    public Service(FamilyTree familyGroup) {
        this.familyGroup = familyGroup;
        this.workFile = new inOutSerialObject();

    }

    public Service() {
        this.familyGroup = new FamilyTree<Animal>();
        this.workFile = new inOutSerialObject();

    }
    public FamilyTree getFamilyGroup() {
        return familyGroup;
    }

    public void addHuman(String firstName, String lastname, String strDateOfBirth, Sex sex, Human mather, Human father) {
        id++;
        familyGroup.add(new Human(id, firstName, lastname, LocalDate.parse(strDateOfBirth), sex, mather, father));
    }

    public void addHuman(String firstName, String lastname, String strDateOfBirth, Sex sex) {
        id++;
        familyGroup.add(new Human(id, firstName, lastname, LocalDate.parse(strDateOfBirth), sex, null, null));
    }


 public boolean delHumanID(int id){
    familyGroup.delHumanID(id);
     return true;
 }

 public List<Animal> searchHuman(String lastname){
        return familyGroup.searchHuman(lastname);
 }
    public void sortByID() {
        familyGroup.sortByID();
    }

    public void sortByLastName() {
        familyGroup.sortByLastName();
    }

    public boolean saveFamilyGroup(String str) {
        if(workFile.saveFile(this.familyGroup, str)) return true;
        else return false;
    }

    public boolean loadFamilyGroup(String str) {
        FamilyTree temp = workFile.loadFile(str);
        if(Objects.nonNull(temp)) {
            this.familyGroup = temp;
            if (Objects.nonNull(familyGroup)) {
                id = 1;
                for (Animal item : this.familyGroup) {
                    if (id < item.getId()) id = item.getId();
                }
                return true;
            }
        }
        return false;
    }
}



