package com.github.curriculeon.genericinventory;

import com.github.curriculeon.GenericInventory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 12/16/2019.
 */
public class GetTest {
    // given
    private <SomeType> void test(SomeType[] objectsToBeAdded, SomeType expectedObject, int indexOfElement) {
        GenericInventory<SomeType> genericInventory = new GenericInventory<>();
        for(SomeType someObject : objectsToBeAdded) {
            genericInventory.add(someObject);
            Boolean itemHasBeenAdded = genericInventory.contains(someObject);
            Assert.assertTrue(itemHasBeenAdded);
        }

        // when
        SomeType actualObject = genericInventory.get(indexOfElement);

        // then
        Assert.assertEquals(expectedObject, actualObject);
    }

    @Test
    public void test0() {
        String[] valuesToAdd = new String[]{"The", "Quick", "Brown"};
        int indexOfElement = 0;
        String expectedObject = valuesToAdd[indexOfElement];
        test(valuesToAdd, expectedObject, indexOfElement);
    }

    @Test
    public void test1() {
        String[] valuesToAdd = new String[]{"The", "Quick", "Brown"};
        int indexOfElement = 1;
        String expectedObject = valuesToAdd[indexOfElement];
        test(valuesToAdd, expectedObject, indexOfElement);
    }

    @Test
    public void test2() {
        String[] valuesToAdd = new String[]{"The", "Quick", "Brown"};
        int indexOfElement = 2;
        String expectedObject = valuesToAdd[indexOfElement];
        test(valuesToAdd, expectedObject, indexOfElement);
    }
}
