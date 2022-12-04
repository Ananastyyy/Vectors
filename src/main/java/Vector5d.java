import java.util.ArrayList;

public class Vector5d extends Vector {

    public Vector5d(int x, int y, int z, int u, int v) {
        super(x, y, z, u, v);
    }

    @Override
    Vector createVector(int[] coord) {
        return new Vector5d(coord[0], coord[1], coord[2], coord[3], coord[4]);
    }

    @Override
    public Vector5d addition(Vector vSecond) {
        return (Vector5d) super.addition(vSecond);
    }

    @Override
    public Vector5d subtraction(Vector vSecond) {
        return (Vector5d) super.subtraction(vSecond);
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
