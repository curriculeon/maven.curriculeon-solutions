package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 12/16/2019.
 */
public class NonNullaryConstructor {
    private void test(String expectedFirstName, String expectedLastName) {
        Person person = new Person(expectedFirstName, expectedLastName);

        // when
        String actualFirstName = person.getFirstName();
        String actualLastName = person.getLastName();

        // then
        Assert.assertEquals(expectedFirstName, actualFirstName);
        Assert.assertEquals(expectedLastName, actualLastName);
    }

    @Test
    public void test0() {
        test("Leon", "Hunter");
    }

    @Test
    public void test1(){
        test("Ali", "Hyman");
    }

    @Test
    public void test2(){
        test("Nelson", "Mandela");
    }
}
