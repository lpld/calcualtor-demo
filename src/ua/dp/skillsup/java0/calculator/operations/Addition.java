package ua.dp.skillsup.java0.calculator.operations;

/**
 * Операция "сложение"
 *
 * @author leopold
 * @since 9/12/16
 */
public final class Addition implements Operation {

  // мы хотим запретить создание новых экземпляров, поэтому делаем конструктор
  // доступным только из пакета operations
  Addition() {
  }

  @Override
  public double apply(double arg1, double arg2) {
    return arg1 + arg2;
  }
}
