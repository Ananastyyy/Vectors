import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class VectorNdTest {

    VectorNd vector1 = new VectorNd(1, 2, 3, 4);
    VectorNd vector2 = new VectorNd(4, 5, 6, 7);

    VectorNd vector3 = new VectorNd(1, 2, 3, 4);
    VectorNd vector4 = new VectorNd(1, 2, 3, 4, 5);

    @Test
    public void testAdditionVectors() {
        VectorNd result = vector1.addition(vector2);
        int[] example = new int[]{5, 7, 9, 11};
        assertArrayEquals(example, result.coordinates);
    }

    @Test
    public void testAdditionVectorWithDifferenceDimensions() throws IllegalArgumentException {
        assertThrows(IllegalArgumentException.class, () -> vector1.addition(vector4), "Вектора имеют разные размеры");
    }

    @Test
    void testSubtractionVectors() {
        VectorNd result = vector1.subtraction(vector2);
        int[] example = new int[]{-3, -3, -3, -3};
        assertArrayEquals(example, result.coordinates);
    }

    @Test
    public void testSubtractionVectorsWithDifferenceDimensions() throws IllegalArgumentException {
        assertThrows(IllegalArgumentException.class, () -> vector1.subtraction(vector4), "Вектора имеют разные размеры");
    }

    @Test
    void testScalarProductVectors() {
        int result = vector1.scalarProduct(vector2);
        int example = 60;
        assertEquals(example, result);
    }

    @Test
    public void testScalarProductVectorsWithDifferenceDimensions() throws IllegalArgumentException {
        assertThrows(IllegalArgumentException.class, () -> vector1.scalarProduct(vector4), "Вектора имеют разные размеры");
    }


    @Test
    public void testComparisionByCoordinatesEqualsVector() {
        Boolean result = vector1.comparisonByCoordinates(vector3);
        Boolean example = true;
        assertEquals(example, result);
    }

    @Test
    public void testComparisionByCoordinatesEqualsVectorWithDifferenceDimensions() throws IllegalArgumentException {
        assertThrows(IllegalArgumentException.class, () -> vector1.comparisonByCoordinates(vector4), "Вектора имеют разные размеры");
    }

    @Test
    public void testComparisionByCoordinatesNotEqualsVector() {
        Boolean result = vector1.comparisonByCoordinates(vector2);
        Boolean example = false;
        assertEquals(example, result);
    }

    @Test
    public void testToStringValueVector() {
        String result = vector1.toStringValue();
        String example = "Координаты вектора: 1, 2, 3, 4";
        assertEquals(example, result);
    }

}

