package lessons.plural.generic;

import java.util.Comparator;

import basics.overrideeh.Student;

public class AgeComparator implements Comparator<Student> {

  @Override
  public int compare(Student left, Student right) {
    return Integer.compare(left.getAge(), right.getAge());
  }
}
