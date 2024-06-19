package com.goldman;

import java.util.HashMap;
import java.util.Map;

public class RepeatedLetter {
  public static void main(String[] args) {
    String str = "abcabcbb";
    int[] indices = findRepeatedLetter(str);
    if (indices != null) {
      System.out.println("The first repeated letter starts at index " + indices[0] + " and ends at index " + indices[1]);
    } else {
      System.out.println("No repeated letters were found.");
    }
  }

  public static int[] findRepeatedLetter(String str) {
    Map<Character, Integer> charMap = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (charMap.containsKey(c)) {
        int startIndex = charMap.get(c);
        int endIndex = i;
        return new int[] { startIndex, endIndex };
      } else {
        charMap.put(c, i);
      }
    }
    return null;
  }
}

