package com.github.curriculeon;

/**
 * Created by leon on 12/16/2019.
 */
public class GenericInventory<SomeType> implements InventoryInterface<SomeType> {
    @Override
    public void add(SomeType someObject) {

    }

    @Override
    public Boolean contains(SomeType someObject) {
        return null;
    }

    @Override
    public SomeType get(int indexOfElement) {
        return null;
    }

    @Override
    public SomeType remove(int indexOfElement) {
        return null;
    }

    @Override
    public SomeType[] toArray(SomeType[] objectsToBeAdded) {
        return null;
    }
}
