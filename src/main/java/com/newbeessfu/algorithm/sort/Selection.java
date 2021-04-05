package com.newbeessfu.algorithm.sort;

public class Selection implements Sort {

  @Override
  public void sort(long[] sourceArray) {
    for (int i = 0; i < sourceArray.length; i++) {
      int min = i;
      for (int j = i + 1; j < sourceArray.length; j++) {
        if (sourceArray[j] < sourceArray[min]) {
          min = j;
        }
      }
      if (i != min) {
        swap(sourceArray, i, min);
      }
    }
  }


}
