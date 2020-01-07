package com.github.curriculeon.iteminventory;

import com.github.curriculeon.Item;
import com.github.curriculeon.ItemInventory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 12/16/2019.
 */
public class GetTest {
    // given
    private void test(Item[] objectsToBeAdded, Item expectedObject, int indexOfElement) {
        ItemInventory genericInventory = new ItemInventory();
        for (Item someObject : objectsToBeAdded) {
            genericInventory.add(someObject);
            Boolean itemHasBeenAdded = genericInventory.contains(someObject);
            Assert.assertTrue(itemHasBeenAdded);
        }

        // when
        Item actualObject = genericInventory.get(indexOfElement);

        // then
        Assert.assertEquals(expectedObject, actualObject);
    }

    @Test
    public void test0() {
        Item item1 = new Item("Milk");
        Item item2 = new Item("Eggs");
        Item item3 = new Item("Bread");
        Item[] valuesToAdd = new Item[]{item1, item2, item3};
        int indexOfElement = 0;
        Item expectedObject = valuesToAdd[indexOfElement];

        test(valuesToAdd, expectedObject, indexOfElement);
    }

    @Test
    public void test1() {
        Item item1 = new Item("Cereal");
        Item item2 = new Item("Pizza");
        Item item3 = new Item("Hot wings");
        Item[] valuesToAdd = new Item[]{item1, item2, item3};
        int indexOfElement = 1;
        Item expectedObject = valuesToAdd[indexOfElement];

        test(valuesToAdd, expectedObject, indexOfElement);
    }


    @Test
    public void test2() {
        Item item1 = new Item("Starburst");
        Item item2 = new Item("Snickers");
        Item item3 = new Item("Twix");
        Item[] valuesToAdd = new Item[]{item1, item2, item3};
        int indexOfElement = 2;
        Item expectedObject = valuesToAdd[indexOfElement];

        test(valuesToAdd, expectedObject, indexOfElement);
    }
}