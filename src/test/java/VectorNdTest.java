import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class VectorNdTest {

    /**
     * Поля с векторами
     */
    VectorNd vector1 = new VectorNd(1, 2, 3, 4);
    VectorNd vector2 = new VectorNd(4, 5, 6, 7);

    VectorNd vector3 = new VectorNd(1, 2, 3, 4);
    VectorNd vector4 = new VectorNd(1, 2, 3, 4, 5);

    /**
     * Тест с суммой векторов одного размера
     */
    @Test
    public void testAdditionVectors() {
        VectorNd result = vector1.addition(vector2);
        int[] example = new int[]{5, 7, 9, 11};
        assertArrayEquals(example, result.coordinates);
    }

    /**
     * Тест с суммой разного векторов
     */

    @Test
    public void testAdditionVectorWithDifferenceDimensions() throws IllegalArgumentException {
        assertThrows(IllegalArgumentException.class, () -> vector1.addition(vector4), "Вектора имеют разные размеры");
    }

    /**
     * Тест с разностью векторов одного размера
     */
    @Test
    void testSubtractionVectors() {
        VectorNd result = vector1.subtraction(vector2);
        int[] example = new int[]{-3, -3, -3, -3};
        assertArrayEquals(example, result.coordinates);
    }

    /**
     * Тест с разностью векторов разного размера
     */

    @Test
    public void testSubtractionVectorsWithDifferenceDimensions() throws IllegalArgumentException {
        assertThrows(IllegalArgumentException.class, () -> vector1.subtraction(vector4), "Вектора имеют разные размеры");
    }

    /**
     * Тест со скалярным произведением векторов одного размера
     */
    @Test
    void testScalarProductVectors() {
        int result = vector1.scalarProduct(vector2);
        int example = 60;
        assertEquals(example, result);
    }

    /**
     * Тест со скалярным произведением векторов разного размера
     */
    @Test
    public void testScalarProductVectorsWithDifferenceDimensions() throws IllegalArgumentException {
        assertThrows(IllegalArgumentException.class, () -> vector1.scalarProduct(vector4), "Вектора имеют разные размеры");
    }

    /**
     * Тест с координатным сравнением одинаковых векторов с одним размером
     */

    @Test
    public void testComparisionByCoordinatesEqualsVector() {
        Boolean result = vector1.comparisonByCoordinates(vector3);
        Boolean example = true;
        assertEquals(example, result);
    }

    /**
     * Тест с координатным сравнением разных по размеру векторов
     */
    @Test
    public void testComparisionByCoordinatesEqualsVectorWithDifferenceDimensions() throws IllegalArgumentException {
        assertThrows(IllegalArgumentException.class, () -> vector1.comparisonByCoordinates(vector4), "Вектора имеют разные размеры");
    }

    /**
     * Тест с координатным сравнением разных векторов одинакового размера
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
        String example = "Координаты вектора: 1, 2, 3, 4";
        assertEquals(example, result);
    }

}

