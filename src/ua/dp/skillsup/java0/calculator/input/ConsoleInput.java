package ua.dp.skillsup.java0.calculator.input;

import java.util.Scanner;

import ua.dp.skillsup.java0.calculator.expression.Expression;

/**
 * Ввод для калькулятора из консоли.
 *
 * @author leopold
 * @since 10/12/16
 */
public class ConsoleInput implements CalculatorInput {

  private final Scanner console = new Scanner(System.in);

  @Override
  public boolean hasMore() {
    // Ввод будет бесконечным, поэтому всегда true.
    return true;
  }

  @Override
  public Expression getNextExpression() {
    // приглашаем пользователя ввести значение
    System.out.print("\n> "); // \n означает новую строку

    // читаем из консоли строку и преобразовываем ее в выражение
    return new ExpressionParser(console.nextLine()).parse();
  }
}
