package edu.grinnell.csc207.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import net.jqwik.api.*;
import net.jqwik.api.constraints.*;

import static edu.grinnell.csc207.testing.Sorts.selectionSort;

public class SortsTests {

  @Test
  public void exampleTest() {
    int[] arr = new int[] { 3, 1, 8, 7, 2, 4 };
    selectionSort(arr);
    String result = Arrays.toString(arr);
    assertEquals("[1, 2, 3, 4, 7, 8]", result);
  } 
}
