package ua.dp.skillsup.java0.calcualtor.output;

/**
 * Выыод на консоль
 *
 * @author leopold
 * @since 10/12/16
 */
public class ConsoleOutput implements CalculatorOutput {

  @Override
  public void sendResult(Double value) {
    // Просто печатаем значение в консоль
    System.out.println(value);
  }
}
