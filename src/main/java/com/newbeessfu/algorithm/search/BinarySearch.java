package com.newbeessfu.algorithm.search;

public class BinarySearch {

  public int search1(int[] a, int key, int lo, int hi) {
    if (lo > hi) {
      return lo;
    }
    int mid = (hi - lo) / 2;
    if (a[mid] == key) {
      return mid;
    } else if (a[mid] > key) {
      return search1(a, key, lo, mid - 1);
    } else {
      return search1(a, key, mid + 1, hi);
    }
  }

  public int search2(int[] a, int key) {
    int lo = 0, hi = a.length - 1;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (a[mid] == key) {
        return mid;
      } else if (a[mid] > key) {
        hi = mid - 1;
      } else {
        lo = mid + 1;
      }
    }
    return -1;
  }
}
