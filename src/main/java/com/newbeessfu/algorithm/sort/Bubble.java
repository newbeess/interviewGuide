package com.newbeessfu.algorithm.sort;

public class Bubble implements Sort {

  @Override
  public void sort(long[] sourceArray) {
    for (int i = sourceArray.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (sourceArray[j] > sourceArray[j + 1]) {
          swap(sourceArray, j, j + 1);
        }
      }
    }
  }
}
