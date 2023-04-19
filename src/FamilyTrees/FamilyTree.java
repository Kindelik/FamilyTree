package FamilyTrees;
import Animal.Animal;
import Humans.HumanComparatorByID;
import Humans.HumanComparatorByLastName;
import Humans.HumanIterator;
import java.io.Serializable;
import java.util.*;

/* Создание класса в котором будет хранится весь перечень людей
    и различные методы для работы с этим деревом
    */
public class FamilyTree<E extends Animal> implements Serializable,Iterable<E> {
    private List<E> familyTree;
    public FamilyTree(List<E> familyTree) {
        this.familyTree = familyTree;
    }
    public FamilyTree() {
        this.familyTree = new ArrayList<>();
    }
    public List<E> getFamilyTree() {
        return familyTree;
    }
    // Добавить новый объект Humans.Humans.Human в лист дерева
    public void add(E human) {
        if (!familyTree.contains(human)) {
            this.familyTree.add(human);
            if (human.getFather() != null) human.getFather().addChildren(human);
            if (human.getMather() != null) human.getMather().addChildren( human);
        }
    }
    public void delHumanID(int id) {
        for (Animal item : this
        ) {
            if (item.getId() == id) {
                getFamilyTree().remove(item);
            }
        }
    }
    // Поиск человека по Фамилии в дереве
    public List<E> searchHuman(String lastName) {
        List<E> searchTemp = new ArrayList<>();
        for (E item : familyTree) {
            if (item.getLastname().equals(lastName)) searchTemp.add(item);
        }
        return searchTemp;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FamilyTree that = (FamilyTree) o;
        return Objects.equals(familyTree, that.familyTree);
    }
    @Override
    public int hashCode() {
        return Objects.hash(familyTree);
    }

    @Override
    public String toString() {
        for (E item : familyTree) {
            System.out.println(item);
        }
        return " ";
    }
    @Override
    public Iterator<E> iterator() {

        return new HumanIterator(familyTree);
    }

    public void sortByID() {
        familyTree.sort((Comparator<? super E>) new HumanComparatorByID());
    }

    public void sortByLastName() {
        familyTree.sort((Comparator<? super E>) new HumanComparatorByLastName());
    }
}

