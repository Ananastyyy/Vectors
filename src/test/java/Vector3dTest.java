import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Vector3dTest {

    Vector3d vector1 = new Vector3d(1, 2, 3);
    Vector3d vector2 = new Vector3d(4, 5, 6);

    Vector3d vector3 = new Vector3d(1, 2, 3);

    @Test
    public void testAdditionVectors() {
        Vector3d result = vector1.addition(vector2);
        int[] example = new int[]{5, 7, 9};
        assertArrayEquals(example, result.coordinates);
    }

    @Test
    public void testSubtractionVectors() {
        Vector3d result = vector1.subtraction(vector2);
        int[] example = new int[]{-3, -3, -3};
        assertArrayEquals(example, result.coordinates);
    }

    @Test
    public void testScalarProductVectors() {
        int result = vector1.scalarProduct(vector2);
        int example = 32;
        assertEquals(example, result);
    }

    @Test
    public void testComparisionByCoordinatesEqualsVector() {
        Boolean result = vector1.comparisonByCoordinates(vector3);
        Boolean example = true;
        assertEquals(example, result);
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
        String example = "Координаты вектора: 1, 2, 3";
        assertEquals(example, result);
    }
}
