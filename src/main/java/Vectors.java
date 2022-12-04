import java.util.ArrayList;

/*
 * Интерфейс векторов
 */
public interface Vectors {
    /*
     * Метод, реализующий сумму векторов
     */
    Vector addition(Vector vSecond);

    /*
     * Метод, реализующий разность векторов
     */
    Vector subtraction(Vector vSecond);

    /*
     * Метод, реализующий скалярное произведение векторов
     */
    int scalarProduct(Vector vSecond);

    /*
     * Метод, реализующий по координатное сравнение векторов
     */
    Boolean comparisonByCoordinates(Vector vSecond);

    /*
     * Метод, реализующий перевод вектора в строку
     */
    String toStringValue();
}
