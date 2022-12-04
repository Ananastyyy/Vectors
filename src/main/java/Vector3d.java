import java.util.ArrayList;

public class Vector3d extends Vector {

    public Vector3d(int x, int y, int z) {
        super(x, y, z);
    }

    @Override
    Vector createVector(int[] coord) {
        return new Vector3d(coord[0], coord[1], coord[2]);
    }

    @Override
    public Vector3d addition(Vector vSecond) {
        return (Vector3d) super.addition(vSecond);
    }

    @Override
    public Vector3d subtraction(Vector vSecond) {
        return (Vector3d) super.subtraction(vSecond);
    }

    @Override
    public int scalarProduct(Vector vSecond) {
        return super.scalarProduct(vSecond);
    }

    @Override
    public Boolean comparisonByCoordinates(Vector vSecond) {
        return super.comparisonByCoordinates(vSecond);
    }

    @Override
    public String toStringValue() {
        return super.toStringValue();
    }
}
