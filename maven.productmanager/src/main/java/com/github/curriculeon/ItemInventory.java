package com.github.curriculeon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 12/16/2019.
 */
public class ItemInventory implements InventoryInterface<Item> {
    private List<Item> list;
    public ItemInventory(List<Item> prePopulatedList) {
        this.list = prePopulatedList;
    }

    public ItemInventory() {
        this.list = new ArrayList<>();
    }

    @Override
    public void add(Item someObject) {
        list.add(someObject);
    }

    @Override
    public Boolean contains(Item someObject) {
        return list.contains(someObject);
    }

    @Override
    public Item get(int indexOfElement) {
        return list.get(indexOfElement);
    }

    @Override
    public Item remove(int indexOfElement) {
        Item result = list.get(indexOfElement);
        list.remove(result);
        return result;
    }

    @Override
    public Item[] toArray(Item[] objectsToBeAdded) {
        return list.toArray(objectsToBeAdded);
    }
}
