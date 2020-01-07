package com.github.curriculeon.stringparser;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.StringParser;

import java.util.List;

/**
 * @author leon on 10/01/2019.
 */
public class ToListTest {
    public void test(String[] input, String expected) {
        List<String> output = StringParser.toList(input);
        String actual = output.toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        String[] input = {"The", "Quick", "Brown"};
        test(input, "[The, Quick, Brown]");
    }

    @Test
    public void test2() {
        String[] input = {"Fox", "Jumps", "Over"};
        test(input, "[Fox, Jumps, Over]");
    }

    @Test
    public void test3() {
        String[] input = {"The", "Lazy", "Dog"};
        test(input, "[The, Lazy, Dog]");
    }
}
