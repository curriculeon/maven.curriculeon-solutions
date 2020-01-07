package com.github.curriculeon.iteminventory;

import com.github.curriculeon.Item;
import com.github.curriculeon.ItemInventory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 12/16/2019.
 */
public class RemoveTest {
    // given
    private void test(Item[] expectedItems, Item[] objectsToBeAdded, int indexOfElement) {
        Item[] actualItems = expectedItems.clone();
        ItemInventory inventory = new ItemInventory();
        for (Item someObject : objectsToBeAdded) {
            inventory.add(someObject);
            Boolean itemHasBeenAdded = inventory.contains(someObject);
            Assert.assertTrue(itemHasBeenAdded);
        }

        // when
        inventory.remove(indexOfElement);
        actualItems = inventory.toArray(actualItems);

        // then
        Assert.assertArrayEquals(expectedItems, actualItems);
    }


    @Test
    public void test0() {
        Item item1 = new Item("Milk");
        Item item2 = new Item("Bread");
        Item item3 = new Item("Eggs");
        Item item4 = new Item("Yogurt");
        Item[] objectsToBeAdded = new Item[]{item1, item2, item3, item4};
        Item[] expectedItems = new Item[]{item2, item3, item4};
        Integer indexToRemove = 0;
        test(expectedItems, objectsToBeAdded, indexToRemove);
    }


    @Test
    public void test1() {
        Item item1 = new Item("Milk");
        Item item2 = new Item("Bread");
        Item item3 = new Item("Eggs");
        Item item4 = new Item("Yogurt");
        Item[] objectsToBeAdded = new Item[]{item1, item2, item3, item4};
        Item[] expectedItems = new Item[]{item1, item3, item4};
        Integer indexToRemove = 1;
        test(expectedItems, objectsToBeAdded, indexToRemove);
    }


    @Test
    public void test2() {
        Item item1 = new Item("Milk");
        Item item2 = new Item("Bread");
        Item item3 = new Item("Eggs");
        Item item4 = new Item("Yogurt");
        Item[] objectsToBeAdded = new Item[]{item1, item2, item3, item4};
        Item[] expectedItems =  new Item[]{item1, item2, item4};
        Integer indexToRemove = 2;
        test(expectedItems, objectsToBeAdded, indexToRemove);
    }
}
