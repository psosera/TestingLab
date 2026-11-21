package edu.grinnell.csc207.testing;

public class Sorts {

  private static void swap(int[] arr, int i, int j) {
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
  }

  public static void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int minIndex = i;
      for (int j = i + 1; j < arr.length; j++) {
        minIndex = arr[j] < arr[minIndex] ? j : minIndex;
      }
      swap(arr, i, minIndex);
    }
  }
}
