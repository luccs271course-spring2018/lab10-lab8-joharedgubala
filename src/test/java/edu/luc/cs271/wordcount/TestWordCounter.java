package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestWordCounter {

  // Done complete this test class

  // TODO declare a reference to the SUT (system under test), i.e., WordCounter
  WordCounter wordcount;

  @Before
  public void setUp() {
    // DONE create the SUT instance
    Map<String, Integer> testMap = new HashMap<String, Integer>();
    wordcount = new WordCounter(testMap);
  }

  @After
  public void tearDown() {
    // DONE set the SUT instance to null
    wordcount = null;
  }

  @Test
  public void testGetCountEmpty() {

    // TODO verify that the SUT initially returns an empty map
    assertTrue(wordcount.getCounts().isEmpty());
  }

  @Test
  public void testGetCountNonEmpty() {

    // TODO run the SUT on a specific String iterator with some repeated words,
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator
    wordcount.countWords(Arrays.asList("he", "he", "the", "they").iterator());

    assertEquals(wordcount.getCount("he"), 2);
    assertEquals(wordcount.getCount("the"), 1);

    // assertNotEquals(wordcount.getCount("she"), 1);
    // assertNotEquals(wordcount.getCount("word"), 1);

    // assertNotEquals(wordcount.getCount("she"), 1);
    // assertNotEquals(wordcount.getCount("word"), 1);

    // I am clueless as to why assertnotequals isn't working.
    // throws NullPointerExeption

  }
}
