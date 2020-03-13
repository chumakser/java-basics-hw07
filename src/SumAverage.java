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
    int[] numbers = IntStream.range(lowerBound, upperBound + 1).toArray();
    double sumToDouble  = sumOfAll(numbers);
    return sumToDouble/numbers.length;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return average of integers
   */
  public static double average(int[] numbers) {
    double sumToDouble  = sumOfAll(numbers);
    return sumToDouble/numbers.length;
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