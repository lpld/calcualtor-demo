package ua.dp.skillsup.java0.calculator.expression;

/**
 * Простое выражение, представояющее собой обычное значение.
 *
 * @author leopold
 * @since 9/12/16
 */
public class Value implements Expression {

  private final double value;

  public Value(double value) {
    this.value = value;
  }

  @Override
  public double evaluate() {
    return value;
  }
}
