package ua.dp.skillsup.java0.calcualtor.expression;

/**
 * Абстракция, представляющая собой арифметическое выражение.
 * Может быть простым значением ("8") или состоять из других выражение
 * и операций ("8 * 4", "4 - (2 / 7)")
 *
 * @author leopold
 * @since 9/12/16
 */
public interface Expression {

  /**
   * Вычислить выражение
   */
  double evaluate();
}

