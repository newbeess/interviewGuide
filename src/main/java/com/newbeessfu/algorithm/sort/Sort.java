package com.newbeessfu.algorithm.sort;

public interface Sort {

  void sort(long[] sourceArray);

  default void swap(long[] arr, int i, int j) {
    long temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
