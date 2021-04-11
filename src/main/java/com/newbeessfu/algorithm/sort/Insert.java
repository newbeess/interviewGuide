package com.newbeessfu.algorithm.sort;

public class Insert implements Sort {

  @Override
  public void sort(long[] sourceArray) {
    for (int i = 1; i < sourceArray.length; i++) {
      long temp = sourceArray[i];
      int pos = i;
      while (pos > 0 && temp < sourceArray[pos - 1]) {
        sourceArray[pos] = sourceArray[pos - 1];
        pos--;
      }
      if (pos != i) {
        sourceArray[pos] = temp;
      }
    }
  }


}
