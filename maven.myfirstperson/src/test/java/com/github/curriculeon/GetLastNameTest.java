package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 12/16/2019.
 */
public class GetLastNameTest {
    //given
    private void test(String expectedLastName) {
        Person person = new Person();
        person.setLastName(expectedLastName);

        // when
        String actualFirstName = person.getLastName();

        // then
        Assert.assertEquals(expectedLastName, actualFirstName);
    }

    @Test
    public void test0() {
        test("Leon");
    }

    @Test
    public void test1() {
        test("Hunter");
    }

    @Test
    public void test2() {
        test("Ali");
    }
}
