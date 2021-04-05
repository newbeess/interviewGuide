package com.newbeessfu.algorithm.sort;

public class Shell implements Sort {

  @Override
  public void sort(long[] sourceArray) {
    for (int gap = sourceArray.length / 2; gap >= 1; gap = gap / 2) {
      for (int i = gap; i < sourceArray.length; i++) {
        for (int j = i; j >= gap; j = j - gap) {
          if (sourceArray[j] < sourceArray[j - gap]) {
            swap(sourceArray, j, j - gap);
          } else {
            break;
          }
        }
      }
    }
  }
}
