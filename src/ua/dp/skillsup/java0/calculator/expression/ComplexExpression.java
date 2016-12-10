package ua.dp.skillsup.java0.calculator.expression;


import ua.dp.skillsup.java0.calculator.operations.Operation;

/**
 * Сложное выражение, состоящее из двух других выражение и связывающей их операции.
 * @author leopold
 * @since 9/12/16
 */
public class ComplexExpression implements Expression {

  private final Expression expr1;
  private final Expression expr2;

  private final Operation operation;

  public ComplexExpression(Expression expr1, Operation operation, Expression expr2) {
    this.expr1 = expr1;
    this.expr2 = expr2;
    this.operation = operation;
  }

  @Override
  public double evaluate() {

    // вычисляем оба вложенных выражение
    double res1 = expr1.evaluate();
    double res2 = expr2.evaluate();

    // применяем операцию к результатам
    return operation.apply(res1, res2);
  }
}
