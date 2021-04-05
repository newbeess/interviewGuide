package com.newbeessfu.algorithm.sort;

public class Insert implements Sort {

  @Override
  public void sort(long[] sourceArray) {
    for (int i = 1; i < sourceArray.length; i++) {
      for (int j = i; j > 0; j--) {
        if (sourceArray[j] < sourceArray[j - 1]) {
          swap(sourceArray, j, j - 1);
        } else {
          break;
        }
      }
    }
  }


}
