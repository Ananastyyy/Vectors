import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Vector5dTest {
    /**
     * Поля с векторами
     */
    Vector5d vector1 = new Vector5d(1, 2, 3, 4, 5);
    Vector5d vector2 = new Vector5d(4, 5, 6, 7, 8);

    Vector5d vector3 = new Vector5d(1, 2, 3, 4, 5);

    /**
     * Тест с суммой векторов
     */
    @Test
    public void testAdditionVectors() {
        Vector5d result = vector1.addition(vector2);
        int[] example = new int[]{5, 7, 9, 11, 13};
        assertArrayEquals(example, result.coordinates);
    }

    /**
     * Тест с разностью векторов
     */

    @Test
    public void testSubtractionVectors() {
        Vector5d result = vector1.subtraction(vector2);
        int[] example = new int[]{-3, -3, -3, -3, -3};
        assertArrayEquals(example, result.coordinates);
    }

    /**
     * Тест со скалярным произведением векторов
     */

    @Test
    public void testScalarProductVectors() {
        int result = vector1.scalarProduct(vector2);
        int example = 100;
        assertEquals(example, result);
    }

    /**
     * Тест с координатным сравнением одинаковых векторов
     */
    @Test
    public void testComparisionByCoordinatesEqualsVector() {
        Boolean result = vector1.comparisonByCoordinates(vector3);
        Boolean example = true;
        assertEquals(example, result);
    }

    /**
     * Тест с координатным сравнением разных векторов
     */

    @Test
    public void testComparisionByCoordinatesNotEqualsVector() {
        Boolean result = vector1.comparisonByCoordinates(vector2);
        Boolean example = false;
        assertEquals(example, result);
    }

    /**
     * Тест со строковым представлением вектора
     */

    @Test
    public void testToStringValueVector() {
        String result = vector1.toStringValue();
        String example = "Координаты вектора: 1, 2, 3, 4, 5";
        assertEquals(example, result);
    }
}
