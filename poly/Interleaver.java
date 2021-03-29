package poly;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/** Interleaver class, to mimic to have the main functionality of interleaving and zipping.*/
public class Interleaver {

  /**
   * Given two lists, this function interleave them.
   *
   * @param xs the first list
   * @param ys the second list
   * @param <T> the type of the elements in the lists
   * @return A list of corresponding elements from xs and ys, rest are ignored
   */
  public static <T> List<T> interleave(List<T> xs, List<T> ys) {
    return IntStream.range(0, Math.min(xs.size(), ys.size()))
        .mapToObj(i -> Arrays.asList(xs.get(i), ys.get(i)))
        .flatMap(Collection::stream)
        .collect(Collectors.toList());
  }

  /**
   * Given two lists, this function zips them in to list of pairs.
   *
   * @param xs the first list
   * @param ys the second list
   * @param <T1> the type of the elements in the first list
   * @param <T2> the type of the elements in the second list
   * @return a list of pairs of corresponding elements from xs and ys, rest are ignored
   */
  public static <T1, T2> List<Pair<T1, T2>> toPairs(List<T1> xs, List<T2> ys) {
    return IntStream.range(0, Math.min(xs.size(), ys.size()))
        .mapToObj(i -> new Pair<T1, T2>(xs.get(i), ys.get(i)))
        .collect(Collectors.toList());
  }
}
