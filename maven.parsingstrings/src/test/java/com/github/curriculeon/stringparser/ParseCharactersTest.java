package com.github.curriculeon.stringparser;

import com.github.curriculeon.StringParser;
import com.github.curriculeon.TestUtils;
import org.junit.Test;

/**
 * @author leon on 10/01/2019.
 */
public class ParseCharactersTest {
    private void test(String input, Character[] expected) {
        Character[] actual = StringParser.parseCharacters(input);
        TestUtils.assertArrayEquals(expected, actual);
    }

    @Test
    public void test1() {
        test("123", new Character[]{'1','2','3'});
    }

    @Test
    public void test2() {
        test(" 23", new Character[]{' ', '2','3'});
    }

    @Test
    public void test3() {
        test("   ", new Character[]{' ', ' ', ' '});
    }

    @Test
    public void test4() {
        test(null, null);
    }
}
