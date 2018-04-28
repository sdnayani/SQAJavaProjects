package com.week4.day2.examples.tests;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.week4.day3.examples.AnagramCheck;

public class StringAnagramTest {
	@Test
    public void testIsAnagram() {
        assertTrue(AnagramCheck.isAnagram("word", "wrdo"));
        assertTrue(AnagramCheck.isAnagram("mary", "army"));
        assertTrue(AnagramCheck.isAnagram("stop", "tops"));
        assertTrue(AnagramCheck.isAnagram("boat", "btoa"));
        assertFalse(AnagramCheck.isAnagram("pure", "in"));
        assertFalse(AnagramCheck.isAnagram("fill", "fil"));
        assertFalse(AnagramCheck.isAnagram("b", "bbb"));
        assertFalse(AnagramCheck.isAnagram("ccc", "ccccccc"));
        assertTrue(AnagramCheck.isAnagram("a", "a"));
        assertFalse(AnagramCheck.isAnagram("sleep", "slep"));
       
    }




}
