package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 12/16/2019.
 */
public class NullaryConstructor {
    @Test
    public void test() {
        // given
        Person person = new Person();
        String expectedFirstName = "";
        String expectedLastName = "";

        // when
        String firstName = person.getFirstName();
        String lastName = person.getLastName();

        // then
        Assert.assertEquals(expectedFirstName, firstName);
        Assert.assertEquals(expectedLastName, lastName);
    }
}
