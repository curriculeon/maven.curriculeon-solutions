package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by leon on 12/16/2019.
 */
public class GenericInventory<SomeType> implements InventoryInterface<SomeType>, Iterable<SomeType> {
    private List<SomeType> list;

    public GenericInventory() {
        this.list = new ArrayList<>();
    }

    public GenericInventory(List<SomeType> list) {
        this.list = list;
    }

    @Override
    public void add(SomeType someObject) {
        list.add(someObject);
    }

    @Override
    public Boolean contains(SomeType someObject) {
        return list.contains(someObject);
    }

    @Override
    public SomeType get(int indexOfElement) {
        return list.get(indexOfElement);
    }

    @Override
    public SomeType remove(int indexOfElement) {
        return list.remove(indexOfElement);
    }

    @Override
    public SomeType[] toArray(SomeType[] objectsToBeAdded) {
        return list.toArray(objectsToBeAdded);
    }

    @Override
    public Iterator<SomeType> iterator() {
        return list.iterator();
    }
}
