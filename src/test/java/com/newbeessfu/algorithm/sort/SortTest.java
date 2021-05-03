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

  @Test
  public void name() {
    int reverse = reverse(-180);
    System.out.println(reverse);
  }

  static int INT_MAX    =2147483647;
  static int INT_MIN = -INT_MAX -1;
  public int reverse(int x) {
    int reverse = 0;
    while (x != 0){
      if(reverse > INT_MAX /10 || reverse < INT_MIN /10){
        return 0;
      }
      reverse = reverse * 10 + x % 10;
      x = x/10;
    }
    return reverse;
  }
}