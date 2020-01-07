package com.github.curriculeon.iteminventory;

import com.github.curriculeon.GenericInventory;
import com.github.curriculeon.ItemInventory;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.List;

/**
 * Created by leon on 12/16/2019.
 */
public class PolymorphismTest {
    @Test
    public void test() {
        // given
        ItemInventory inventory = new ItemInventory();

        // when
        Boolean isIterable = inventory instanceof Iterable;
        Boolean isList = inventory instanceof List;
        Boolean isCollection = inventory instanceof Collection;

        // then
        Assert.assertTrue(isIterable);
        Assert.assertFalse(isList);
        Assert.assertFalse(isCollection);
    }
}
