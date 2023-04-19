package Humans;

import java.util.Iterator;
import java.util.List;

public class HumanIterator<E> implements Iterator<E> {

private int index;
private List<Human> humanList;

    public HumanIterator(List<Human> humanList) {
        this.humanList = humanList;
    }

    @Override
    public boolean hasNext() {
        return index< humanList.size();
    }

    @Override
    public E next() {
        return (E) humanList.get(index++);
    }
}
