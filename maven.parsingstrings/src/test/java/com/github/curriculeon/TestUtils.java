package com.github.curriculeon;

import org.junit.Assert;

import java.util.Arrays;

/**
 * @author leon on 10/01/2019.
 */
public class TestUtils {
    public static <ObjectType> void assertArrayEquals(ObjectType[] array1, ObjectType[] array2) {
        if (array1 != null && array2 != null) {
            Arrays.sort(array1);
            Arrays.sort(array2);
        }
        Assert.assertEquals(Arrays.toString(array1), Arrays.toString(array2));
    }


}
