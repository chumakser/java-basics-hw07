import java.util.stream.IntStream;

/**
 * Compute the sum and average for running integers using loop.
 */
public class SumAverage {

  /**
   * Computes sum of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return sum of integers
   */
  public static int sum(int lowerBound, int upperBound) {
    int[] numbers = IntStream.range(lowerBound, upperBound + 1).toArray();
    return sumOfAll(numbers);
  }

  /**
   * Computes sum of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return sum of integers
   */
  public static int sum(int[] numbers) {
    return sumOfAll(numbers);
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return average of integers
   */
  public static double average(int lowerBound, int upperBound) {
    double sum = 0;
    int i = lowerBound;

    while (i <= upperBound) {
      sum = sum + i;
      i++;
    }
    return sum / (upperBound - lowerBound + 1);
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return average of integers
   */
  public static double average(int[] numbers) {
    int i = 0;
    double sum = 0;
    do {
      sum = sum + numbers[i];
      i++;
    }
    while (i<numbers.length);
      return sum/numbers.length;
    //double sumToDouble  = sumOfAll(numbers);
    //return sumToDouble/numbers.length;
  }

  private static int sumOfAll(int[] numbers)
  {
    int sum = 0;
    for (int number: numbers)
    {
      sum = sum + number;
    }
    return sum;
  }
}