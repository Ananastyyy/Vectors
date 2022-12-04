
public class VectorNd extends Vector {

    public VectorNd(int... coord) {
        super(coord);
    }

    @Override
    Vector createVector(int[] coord) {
        return new VectorNd(coord);
    }

    @Override
    public VectorNd addition(Vector vSecond) throws IllegalArgumentException{
        if (dimension.equals(vSecond.dimension)){
            return (VectorNd) super.addition(vSecond);
        }
        else{
            throw new IllegalArgumentException("Вектора имеют разные размеры");
        }
    }

    @Override
    public VectorNd subtraction(Vector vSecond) {
        if (dimension.equals(vSecond.dimension)){
            return (VectorNd) super.subtraction(vSecond);
        }
        else{
            throw new IllegalArgumentException("Вектора имеют разные размеры");
        }
    }

    @Override
    public int scalarProduct(Vector vSecond) {
        if (dimension.equals(vSecond.dimension)){
            return super.scalarProduct(vSecond);
        }
        else{
            throw new IllegalArgumentException("Вектора имеют разные размеры");
        }
    }

    @Override
    public Boolean comparisonByCoordinates(Vector vSecond) {
        if (dimension.equals(vSecond.dimension)){
            return super.comparisonByCoordinates(vSecond);
        }
        else{
            throw new IllegalArgumentException("Вектора имеют разные размеры");
        }
    }

    @Override
    public String toStringValue() {
        return super.toStringValue();
    }
}
