package com.github.curriculeon.stringparser;

import com.github.curriculeon.TestUtils;
import org.junit.Test;
import com.github.curriculeon.StringParser;

/**
 * @author leon on 10/01/2019.
 */
public class ParseStringsTest {
    private void test(String input, String[] expected) {
        String[] actual = StringParser.parseStrings(input);
        TestUtils.assertArrayEquals(expected, actual);
    }

    @Test
    public void test1() {
        test("123", new String[]{"1","2","3"});
    }

    @Test
    public void test2() {
        test(" 23", new String[]{" ", "2","3"});
    }

    @Test
    public void test3() {
        test("   ", new String[]{" ", " ", " "});
    }

    @Test
    public void test4() {
        test(null, null);
    }
}
