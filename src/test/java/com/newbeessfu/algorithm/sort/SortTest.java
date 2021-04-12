package com.newbeessfu.algorithm.sort;


import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;
import org.junit.Before;
import org.junit.Test;


public class SortTest {

  private static final int SIZE = 10;
  private static final long[] arr = new long[SIZE];

  @Before
  public void setUp() {
    int index = 0;
    do {
      arr[index] = ThreadLocalRandom.current().nextLong(10000);
      index++;
    } while (index < SIZE);
  }

  @Test
  public void selectionSort() {
    Sort sort = new Selection();
    System.out.println("before:" + Arrays.toString(arr));
    sort.sort(arr);
    System.out.println("after:" + Arrays.toString(arr));
  }

  @Test
  public void insertSort() {
    Sort sort = new Insert();
    System.out.println("before:" + Arrays.toString(arr));
    sort.sort(arr);
    System.out.println("after:" + Arrays.toString(arr));
  }


  @Test
  public void shellSort() {
    Sort sort = new Shell();
    System.out.println("before:" + Arrays.toString(arr));
    sort.sort(arr);
    System.out.println("after:" + Arrays.toString(arr));
  }


  @Test
  public void merge1Sort() {
    Sort sort = new Merge1();
    System.out.println("before:" + Arrays.toString(arr));
    sort.sort(arr);
    System.out.println("after:" + Arrays.toString(arr));
  }

  @Test
  public void merge2Sort() {
    Sort sort = new Merge2();
    System.out.println("before:" + Arrays.toString(arr));
    sort.sort(arr);
    System.out.println("after:" + Arrays.toString(arr));
  }

  @Test
  public void QuickSort() {
    Sort sort = new Quick();
    System.out.println("before:" + Arrays.toString(arr));
    sort.sort(arr);
    System.out.println("after:" + Arrays.toString(arr));
  }

  @Test
  public void BubbleSort() {
    Sort sort = new Bubble();
    System.out.println("before:" + Arrays.toString(arr));
    sort.sort(arr);
    System.out.println("after:" + Arrays.toString(arr));
  }

  @Test
  public void HeapSort() {
    Sort sort = new Heap();
    System.out.println("before:" + Arrays.toString(arr));
    sort.sort(arr);
    System.out.println("after:" + Arrays.toString(arr));
  }
}