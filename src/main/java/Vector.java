
public abstract class Vector implements Vectors {

    public final int[] coordinates;
    final Integer dimension;

    abstract Vector createVector(int[] coord);

    public Vector(int... vector) {
        this.coordinates = vector;
        this.dimension = vector.length;
    }

    public Vector addition(Vector vSecond){
        int[] result = new int[dimension];
        for (int i=0; i<dimension; ++i){
            result[i] = coordinates[i] + vSecond.coordinates[i];
        }
        return createVector(result);
    }

    public Vector subtraction(Vector vSecond){
        int[] result = new int[dimension];
        for (int i=0; i<dimension; ++i){
            result[i] = coordinates[i] - vSecond.coordinates[i];
        }
        return createVector(result);
    }

    public int scalarProduct(Vector vSecond){
        int result = 0;
        for (int i=0; i<dimension; ++i){
            result += coordinates[i] * vSecond.coordinates[i];
        }
        return result;
    }

    public Boolean comparisonByCoordinates(Vector vSecond){
        for (int i=0; i<dimension; ++i){
            if(coordinates[i] != (vSecond.coordinates[i])){
                return false;
            }
        }
        return true;
    }
    public String toStringValue(){
        StringBuilder result = new StringBuilder("Координаты вектора: ");
        for (int i=0; i<dimension; ++i){
            result.append(coordinates[i]);
            if (i<dimension-1){
                result.append(", ");
            }
        }
        return result.toString();
    }
}
