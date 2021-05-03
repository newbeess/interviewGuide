package com.newbeessfu.algorithm.string;

import java.util.Arrays;

/**
 * key-index-counting
 */
public class KeyIndexedCounting {


  public void sort(Student[] studentArr, int groupCount) {
    int N = studentArr.length;
    int[] count = new int[groupCount + 1];
    Student[] aux = new Student[N];
    //统计各组人数
    for (int i = 0; i < N; i++) {
      count[studentArr[i].getGroupId() + 1]++;
    }
    //统计各组起始位置索引
    for (int i = 0; i < groupCount; i++) {
      count[i + 1] = count[i + 1] + count[i];
    }
    //分类
    for (int i = 0; i < N; i++) {
      Student student = studentArr[i];
      aux[count[student.getGroupId()]++] = student;
    }
    // 回写
    for (int i = 0; i < N; i++) {
      studentArr[i] = aux[i];
    }
  }

  public static void main(String[] args) {
    Student s1 = new Student("S1", 1);
    Student s2 = new Student("S2", 2);
    Student s3 = new Student("S3", 3);
    Student s4 = new Student("S4", 2);
    Student s5 = new Student("S5", 1);
    Student[] arr = {s1, s2, s3, s4, s5};
    System.out.println(Arrays.toString(arr));
    KeyIndexedCounting keyIndexedCounting = new KeyIndexedCounting();
    keyIndexedCounting.sort(arr, 4);
    System.out.println(Arrays.toString(arr));
  }

}
