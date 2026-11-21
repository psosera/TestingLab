package edu.grinnell.csc207.testing;

public class Testing {
  public static void main(String[] args) {
    int arr[] = new int[] { 3, 8, 7, 1, 2, 9, 0, 4, 6 };
    edu.grinnell.csc207.testing.Sorts.selectionSort(arr);
    System.out.println(java.util.Arrays.toString(arr));
  }
}
