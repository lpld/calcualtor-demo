package ua.dp.skillsup.java0.calcualtor;

import ua.dp.skillsup.java0.calcualtor.input.CalculatorInput;
import ua.dp.skillsup.java0.calcualtor.output.CalculatorOutput;

/**
 * Класс "калькулятор", который умеет последовательно брать выражения
 * из "входа", вычислять их и отправлять на "выход".
 *
 * @author leopold
 * @since 10/12/16
 */
public class Calculator {

  private final CalculatorInput input;
  private final CalculatorOutput output;

  public Calculator(CalculatorInput input, CalculatorOutput output) {
    this.input = input;
    this.output = output;
  }

  public void run() {
    // пока в input'е что-то есть, вычисляем результат и отдаем в output.
    while (input.hasMore()) {
      output.sendResult(input.getNextExpression().evaluate());
    }
  }
}
