package com.corndel.photoship.exercises;
import java.util.List;
//import java.util.ArrayList;
//import java.util.Collections;


public class Exercise1b {
  // https://tech-docs.corndel.com/java/lists.html

  /**
   * Given an array, take the last element and put it on the front
   *
   * <p>
   * e.g. {"x", "y", "z"} => {"z", "x", "y"}
   *
   * @param {List<T>} list - The input list
   * @returns {List<T>} The list with the last element at the front
   */
  public static <T> List<T> arrayRotate(List<T> list) {
//    Collections.swap(list,list.getFirst(),list.getLast());
    // TODO
    list.addFirst(list.getLast());
    list.removeLast();
    return list;
  }
}
