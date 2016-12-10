package ua.dp.skillsup.java0.calculator.operations;

/**
 * Абстракция, представляющая арифметическую опеарцию.
 *
 * @author leopold
 * @since 9/12/16
 */
public interface Operation {

  /**
   * Применить операцию к двум аргументам
   */
  double apply(double arg1, double arg2);
}
