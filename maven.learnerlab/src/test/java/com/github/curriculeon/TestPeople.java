package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/13/2020.
 */
public class TestPeople {
    @Test
    public void testAdd() {
        // given
        People people = new People();
        Person personToBeAdded = new Person(0L, "");
        Boolean personHasBeenAdded = people.contains(personToBeAdded);
        Assert.assertFalse(personHasBeenAdded);

        // when
        people.add(personToBeAdded);
        personHasBeenAdded = people.contains(personToBeAdded);

        // then
        Assert.assertTrue(personHasBeenAdded);
    }

    @Test
    public void testRemove() {
        // given
        People people = new People();
        Person personToBeRemoved = new Person(0L, "");
        people.add(personToBeRemoved);
        Boolean personHasBeenAdded = people.contains(personToBeRemoved);
        Assert.assertTrue(personHasBeenAdded);

        // when
        people.remove(personToBeRemoved);

        // then
        personHasBeenAdded = people.contains(personToBeRemoved);
        Assert.assertFalse(personHasBeenAdded);
    }


    @Test
    public void testFindById() {
        // given
        People people = new People();
        Long id = 1000L;
        Person expectedPerson = new Person(id, "");
        people.add(expectedPerson);

        // when
        Person actualPerson = people.findById(id);

        // then
        Assert.assertEquals(expectedPerson, actualPerson);
    }
}
