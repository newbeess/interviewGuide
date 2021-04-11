package com.newbeessfu.algorithm.sort;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Heap implements Sort {

  @Override
  public void sort(long[] sourceArray) {
    int N = sourceArray.length;
    buildHeap(sourceArray, N);
    for (int i = N - 1; i >= 0; i--) {
      swap(sourceArray, i, 0);
      heapify(sourceArray, i, 0);
    }
  }

  private void buildHeap(long[] tree, int n) {
    int lastNode = n - 1;
    int parentNode = (lastNode - 1) / 2;
    for (int i = parentNode; i >= 0; i--) {
      heapify(tree, n, i);
    }
  }

  private void heapify(long[] tree, int n, int i) {
    while (i < n) {
      int c1 = 2 * i + 1;
      int c2 = 2 * i + 2;
      int max = i;
      if (c1 < n && tree[c1] > tree[max]) {
        max = c1;
      }
      if (c2 < n && tree[c2] > tree[max]) {
        max = c2;
      }
      if (max == i) {
        break;
      }
      swap(tree, i, max);
      i = max;
    }
  }

  public static void main(String[] args) {
    int SIZE = 10;
    long[] arr = new long[SIZE];

    int index = 0;
    do {
      arr[index] = ThreadLocalRandom.current().nextLong(10000);
      index++;
    } while (index < SIZE);
    Heap heap = new Heap();
    System.out.println(Arrays.toString(arr));
    heap.heapify(arr, SIZE, 0);
    System.out.println(Arrays.toString(arr));
  }

}
