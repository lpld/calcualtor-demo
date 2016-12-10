package ua.dp.skillsup.java0.calculator.operations;

/**
 * Операция "умножение"
 *
 * @author leopold
 * @since 9/12/16
 */
public class Multiplication implements Operation {

  Multiplication() {
  }

  @Override
  public double apply(double arg1, double arg2) {
    return arg1 * arg2;
  }
}
