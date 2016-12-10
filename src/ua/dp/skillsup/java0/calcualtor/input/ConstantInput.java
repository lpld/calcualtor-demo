package ua.dp.skillsup.java0.calcualtor.input;

import ua.dp.skillsup.java0.calcualtor.expression.ComplexExpression;
import ua.dp.skillsup.java0.calcualtor.expression.Expression;
import ua.dp.skillsup.java0.calcualtor.expression.Value;
import ua.dp.skillsup.java0.calcualtor.operations.Operations;

/**
 * @author leopold
 * @since 9/12/16
 */
public class ConstantInput implements CalculatorInput {

  private boolean hasMore = true;

  @Override
  public boolean hasMore() {
    return hasMore;
  }

  @Override
  public Expression getNextExpression() {
    // просто пример создания выражения "руками". Пример с лекции:
    hasMore = false;
    return new ComplexExpression(
        new ComplexExpression(
            new ComplexExpression(
                new Value(2),
                Operations.ADD,
                new Value(3)
            ),
            Operations.MULTIPLY,
            new Value(3)
        ),
        Operations.ADD,
        new ComplexExpression(
            new Value(7),
            Operations.SUBTRACT,
            new Value(8)
        )
    );
  }
}
