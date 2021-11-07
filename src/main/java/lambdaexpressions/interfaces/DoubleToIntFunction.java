package lambdaexpressions.interfaces;

public interface DoubleToIntFunction {

    /**
     * Applies this functon to the given argument
     *
     * @param value the function argument
     * @return the function result
     */

    int applyAsInt(double value);

}
