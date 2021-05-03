package com.newbeessfu.algorithm.string;

public class Student {

  public Student(String name, int groupId) {
    this.name = name;
    this.groupId = groupId;
  }

  private String name;
  private int groupId;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getGroupId() {
    return groupId;
  }

  public void setGroupId(int groupId) {
    this.groupId = groupId;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", groupId=" + groupId +
        '}';
  }
}
