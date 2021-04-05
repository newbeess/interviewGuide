package com.newbeessfu.algorithm.sort;


public class Quick implements Sort {

  @Override
  public void sort(long[] sourceArray) {
    this.qucikSort(sourceArray, 0, sourceArray.length - 1);
  }

  private void qucikSort(long[] a, int lo, int hi) {
    if (lo >= hi) {
      return;
    }
    int pivot = this.partition(a, lo, hi);
    qucikSort(a, lo, pivot - 1);
    qucikSort(a, pivot + 1, hi);
  }

  /**
   * 返回pivot，并且数组左边小与pivot位置的值，右边大与pivot位置的值
   *
   * @param a
   * @param lo
   * @param hi
   * @return
   */
  private int partition(long[] a, int lo, int hi) {
    long pivotValue = a[lo];
    int i = lo, j = hi;

    while (i < j) {
      while (i < j) {
        if (a[i] < pivotValue) {
          i++;
        } else {
          break;
        }
      }
      while (i < j) {
        if (a[j] > pivotValue) {
          j--;
        } else {
          break;
        }
      }
      if (i >= j) {
        break;
      }
      swap(a, i, j);
    }
    return i;
  }
}
