package poly;

/**
 * A class to mimic the functionality of a tuple in python or haskell.
 *
 * @param <T1> The type of the first element of the pair
 * @param <T2> The type of the second element of the pair
 */
public class Pair<T1, T2> {
  public T1 first;
  public T2 second;

  public Pair(T1 first, T2 second) {
    this.first = first;
    this.second = second;
  }

  @Override
  public String toString() {
    return String.format("(%s,%s)", first.toString(), second.toString());
  }

  public T1 getFirst() {
    return first;
  }

  public T2 getSecond() {
    return second;
  }
}
