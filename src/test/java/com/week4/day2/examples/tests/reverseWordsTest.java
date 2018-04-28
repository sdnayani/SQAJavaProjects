package com.week4.day2.examples.tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.week4.day2.examples.reverseWords;

public class reverseWordsTest {
  @Test
  public void reverseWords() {
	  String expectedWord="world Hello";
	  //"world Hello"
	  
  String reverseWord=reverseWords.reverserWordsInSentence("Hello world");
  reverseWord= reverseWord.trim();
  Assert.assertEquals(reverseWord, expectedWord);
	  
  }
}
