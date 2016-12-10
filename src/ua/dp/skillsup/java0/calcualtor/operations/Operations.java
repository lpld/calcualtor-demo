package ua.dp.skillsup.java0.calcualtor.operations;

/**
 * Класс, содержащий список доступных арифметических операций.
 *
 * @author leopold
 * @since 9/12/16
 */
public final class Operations {

  // этот класс является утилитным, и создавать его экземпляры не имеет смысла.
  // поэтому делаем конструктор приватным
  private Operations() {
  }

  public static final Operation ADD = new Addition();
  public static final Operation SUBTRACT = new Subtraction();
  public static final Operation MULTIPLY = new Multiplication();
  public static final Operation DIVIDE = new Division();

}
