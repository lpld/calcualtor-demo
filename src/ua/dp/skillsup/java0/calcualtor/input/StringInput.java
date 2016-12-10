package ua.dp.skillsup.java0.calcualtor.input;


import ua.dp.skillsup.java0.calcualtor.expression.Expression;

/**
 * CalculatorInput, состоящий из одной строки.
 * @author leopold
 * @since 9/12/16
 */
public class StringInput implements CalculatorInput {

  private final String input;
  private boolean hasMore = true;

  @Override
  public boolean hasMore() {
    return hasMore;
  }

  public StringInput(String input) {
    this.input = input;
  }

  @Override
  public Expression getNextExpression() {
    hasMore = false;
    // преобразуем строку в выражение:
    return new ExpressionParser(input).parse();
  }
}
