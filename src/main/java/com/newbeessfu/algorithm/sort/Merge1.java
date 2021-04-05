package com.newbeessfu.algorithm.sort;

/**
 * 归并排序，自底向上
 */
public class Merge1 implements Sort {

  @Override
  public void sort(long[] sourceArray) {
    this.mergeSort(sourceArray, 0, sourceArray.length - 1);
  }

  /**
   * 递归的拆分问题到单个元素 左闭右闭
   */
  private void mergeSort(long[] arr, int l, int r) {
    //递归终止条件
    if (l >= r) {
      return;
    }
    int m = l + (r - l) / 2;
    mergeSort(arr, l, m);
    mergeSort(arr, m + 1, r);
    merge(arr, l, m, r);

  }

  /**
   * 归并数组
   */
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
