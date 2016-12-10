package ua.dp.skillsup.java0.calcualtor.input;

import ua.dp.skillsup.java0.calcualtor.expression.Expression;

/**
 * Ввод для калькулятора. Этот интерфейс скрывает под собой "поток" входных данных.
 *
 * @author leopold
 * @since 9/12/16
 */
public interface CalculatorInput {

  /**
   * Есть ли еще выражения для обработки
   */
  boolean hasMore();

  /**
   * Получить следующее выражение
   */
  Expression getNextExpression();
}
