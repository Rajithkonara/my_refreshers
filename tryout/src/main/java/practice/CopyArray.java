package practice;

import basics.overrideeh.Student;

public class CopyArray {

  public static void main(String[] args) {

    Student student = new Student(1, "name", 12);

    String[] arr1 = {"a", "b", "c"};

    System.out.println("Initial array size: " + arr1.length);
    for (String s : arr1) {
      System.out.println("initial array: " + s);
    }

    int currentSize = arr1.length;
    int newSize = arr1.length + 1;

    String d = "d";

    String[] arr2 = new String[newSize];

    for (int y = 0; y < currentSize; y++) {
      arr2[y] = arr1[y];
    }

    arr2[newSize - 1] = d;

    arr1 = arr2;

    for (String ss : arr1) {
      System.out.println(ss);
    }
  }
}
