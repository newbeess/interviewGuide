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
    int i = lo, j = hi + 1;

    while (true) {
      // 左->右，找到第一个大于pivot的位置或者hi
      while (a[++i] < pivotValue) {
        if (i == hi) {
          break;
        }
      }
      // 右->左，找到第一个小于pivot的位置或者lo
      while (a[--j] > pivotValue) {
        if (j == lo) {
          break;
        }
      }
      if (i >= j) {
        break;
      }
      // 交换
      swap(a, i, j);
    }
    swap(a, lo, j);
    return j;
  }
}
