import java.util.ArrayList;

/*
 * Интерфейс векторов
 */
public interface Vectors {
    /**
     * Метод, реализующий сумму векторов
     *
     * @param vSecond координаты второго вектора
     */
    Vector addition(Vector vSecond);

    /**
     * Метод, реализующий разность векторов
     *
     * @param vSecond координаты второго вектора
     */
    Vector subtraction(Vector vSecond);

    /**
     * Метод, реализующий скалярное произведение векторов
     *
     * @param vSecond координаты второго вектора
     */
    int scalarProduct(Vector vSecond);

    /**
     * Метод, реализующий по координатное сравнение векторов
     *
     * @param vSecond координаты второго вектора
     */
    Boolean comparisonByCoordinates(Vector vSecond);

    /**
     * Метод, реализующий перевод вектора в строку
     */
    String toStringValue();
}
