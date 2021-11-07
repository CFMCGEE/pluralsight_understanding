package lambdaexpressions.interfaces;

@FunctionalInterface //<-- annotation is optional
public interface Supplier<T> {

    /**
     * Gets a result.
     *
     *
     * @return a result
     */

    T get();

}
