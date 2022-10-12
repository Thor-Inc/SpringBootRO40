package pl.sdacademy.SpringBootRO40.ex4;

import java.util.List;

public class ListUtil {

  public int sumElements(final List<Integer> ints) {
    return ints.stream().reduce(0, Integer::sum);
  }
}