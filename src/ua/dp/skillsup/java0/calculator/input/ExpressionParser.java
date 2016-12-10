package ua.dp.skillsup.java0.calculator.input;

import ua.dp.skillsup.java0.calculator.expression.ComplexExpression;
import ua.dp.skillsup.java0.calculator.expression.Expression;
import ua.dp.skillsup.java0.calculator.expression.Value;
import ua.dp.skillsup.java0.calculator.operations.Operation;
import ua.dp.skillsup.java0.calculator.operations.Operations;

/**
 * Класс отвечающий за преобразование строки (String) в выражение (Expression)
 *
 * @author leopold
 * @since 10/12/16
 */
public class ExpressionParser {

  private String input;

  public ExpressionParser(String input) {
    this.input = input;
  }

  public Expression parse() {

    Expression expr1 = readExpression();

    if (input.isEmpty()) {
      return expr1;
    }

    Operation op = readOperation();
    Expression expr2 = readExpression();

    return new ComplexExpression(expr1, op, expr2);
  }


  // считывает выражение из строки this.input и удаляет его из нее.
  private Expression readExpression() {

    final Expression result;
    if (input.startsWith("(")) {
      // если строка начинается с '(', значит это сложное выражение

      final String expressionString = extractComplexExpression(input);
      result = new ExpressionParser(expressionString).parse(); // создаем еще один парсер для вложенного выражения
      // удаляем из строки input то, что только что прочитали
      input = input.substring(expressionString.length() + 2);
    } else {
      // простое значение

      // считываем до пробела или конца строки:
      int index = input.contains(" ") ? input.indexOf(" ") : input.length();

      final String valueStr = input.substring(0, index);

      // приводим строку к double:
      result = new Value(Double.parseDouble(valueStr));
      // удаляем из строки то, что только считали
      input = input.substring(valueStr.length());
    }

    // обрезаем пробелы с помощью метода String
    input = input.trim();

    return result;
  }

  // считывает сложное выражение из строки
  private static String extractComplexExpression(String str) {
    int m = 0;
    int idx = 0;
    char[] charArray = str.toCharArray();
    for (int i = 0; i < charArray.length; i++) {

      char c = charArray[i];

      if (c == '(') {
        m++;
      }

      if (c == ')') {
        m--;
      }

      if (m == 0) {
        idx = i;
        break;
      }
    }

    return str.substring(1, idx);
  }

  // считываем операцию из строки this.input
  private Operation readOperation() {

    String opString = input.substring(0, 1);

    input = input.substring(1).trim();

    switch (opString) {
      case "+":
        return Operations.ADD;
      case "-":
        return Operations.SUBTRACT;
      case "*":
        return Operations.MULTIPLY;
      case "/":
        return Operations.DIVIDE;
    }

    return null;
  }


}
