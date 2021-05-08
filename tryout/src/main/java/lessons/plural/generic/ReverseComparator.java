package lessons.plural.generic;

import java.util.Comparator;

public class ReverseComparator<T> implements Comparator<T> {

  private final Comparator<T> delegateComparator;

  public ReverseComparator(Comparator<T> delegateComparator) {
    this.delegateComparator = delegateComparator;
  }

  @Override
  public int compare(T left, T right) {
    return -1 * delegateComparator.compare(left, right);
  }
}


// can call

//Collections.sort(stdentList, new ReverseComparator<T>(new AgeComparator()));