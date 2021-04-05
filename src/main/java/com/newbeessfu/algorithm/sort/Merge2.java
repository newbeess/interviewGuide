package com.newbeessfu.algorithm.sort;

/**
 * 自底向上归并
 */
public class Merge2 implements Sort {

  @Override
  public void sort(long[] sourceArray) {
    int N = sourceArray.length;
    for (int gap = 1; gap < N; gap = 2 * gap) {
      for (int lo = 0; lo < N - gap; lo = lo + 2 * gap) {
        this.merge(sourceArray, lo, lo + gap - 1, Math.min(N - 1, lo + 2 * gap));
      }
    }
  }

  private void merge(long[] arr, int low, int mid, int hi) {
    int left = low, right = mid + 1, k = 0;
    long[] temp = new long[hi - low + 1];

    while (left <= mid && right <= hi) {
      if (arr[left] <= arr[right]) {
        temp[k++] = arr[left++];
      } else {
        temp[k++] = arr[right++];
      }
    }
    while (left <= mid) {
      temp[k++] = arr[left++];
    }

    while (right <= hi) {
      temp[k++] = arr[right++];
    }

    for (int i = 0; i < temp.length; i++) {
      arr[low + i] = temp[i];
    }
  }

}
