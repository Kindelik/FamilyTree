package Humans;

import Humans.Human;

import java.util.Comparator;

public class HumanComparatorByID implements Comparator<Human> {


    @Override
    public int compare(Human o1, Human o2) {
        return Integer.compare(o1.getId(), o2.getId());

    }
}
