package ua.dp.skillsup.java0.calcualtor.operations;

/**
 * Операция "деление"
 *
 * @author leopold
 * @since 9/12/16
 */
public final class Division implements Operation {

  Division() {
  }

  @Override
  public double apply(double arg1, double arg2) {
    return arg1 / arg2;
  }
}
