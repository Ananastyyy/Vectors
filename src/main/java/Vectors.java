import java.util.ArrayList;

public interface Vectors {
    Vector addition(Vector vSecond);
    Vector subtraction(Vector vSecond);
    int scalarProduct(Vector vSecond);
    Boolean comparisonByCoordinates(Vector vSecond);
    String toStringValue();
}
