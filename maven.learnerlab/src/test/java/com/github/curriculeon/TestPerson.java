package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor() {
        // given
        String expectedName = "Leon";
        Long expectedId = 0L;

        // when
        Person person = new Person(expectedId, expectedName);
        long actualId = person.getId();
        String actualName = person.getName();

        // then
        Assert.assertEquals(expectedId, actualId, 0);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // given
        String expectedName = "Leon";
        Person person = new Person(0L, "");

        // when
        person.setName(expectedName);
        String actualName = person.getName();

        // then
        Assert.assertEquals(expectedName, actualName);
    }

}

