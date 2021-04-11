package com.newbeessfu.algorithm.sort;

import java.util.Arrays;

/**
 * 大顶堆
 *
 * @param <Key>
 */
public class MaxPQ<Key extends Comparable<Key>> {

  /**
   * 基于堆的完全二叉树
   * </br>
   * pq[1...N]存元素，pq[0]不存储
   */
  public Key[] pq;
  /**
   * 堆当前元素数量
   */
  private int N = 0;

  public MaxPQ(int maxN) {
    pq = (Key[]) new Comparable[maxN + 1];
  }

  public boolean isEmpty() {
    return 0 == N;
  }

  public int size() {
    return N;
  }

  public void insert(Key v) {
    //新元素插入到最后位置
    pq[++N] = v;
    //上浮调整堆
    swim(N);
  }

  public Key delMax() {
    Key max = pq[1];
    swap(1, N--);
    pq[N + 1] = null;
    sink(1);
    return max;
  }


  private void swim(int k) {
    while (k > 1 && less(k / 2, k)) {
      swap(k / 2, k);
      k = k / 2;
    }
  }

  private void sink(int k) {
    while (2 * k <= N) {
      int max = k;
      int c1 = 2 * k;
      int c2 = 2 * k + 1;
      if (c1 <= N && c1 > max) {
        max = c1;
      } else if (c2 <= N && c2 > max) {
        max = c2;
      }
      if (less(max, k)) {
        break;
      }
      swap(max, k);
      k = max;
    }
  }

  private void swap(int i, int j) {
    Key temp = pq[i];
    pq[i] = pq[j];
    pq[j] = temp;
  }

  private boolean less(int i, int j) {
    return pq[i].compareTo(pq[j]) < 0;
  }

  public static void main(String[] args) {
    MaxPQ<Integer> maxPQ = new MaxPQ<>(10);
    for (int i = 0; i < 10; i++) {
      maxPQ.insert(i + 1);
      System.out.println(Arrays.toString(maxPQ.pq));
    }
  }

}
