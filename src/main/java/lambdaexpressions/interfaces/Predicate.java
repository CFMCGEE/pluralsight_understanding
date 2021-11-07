package lambdaexpressions.interfaces;

import java.util.Objects;

public interface Predicate<T> {

    /**
     * Evaluates this predicate on the given argument.
     *
     * @param t the input argument
     * @return {@code true} if the input argument matches the predicate,
     * otherwise {@code false}
     */

    boolean test(T t);

    /**
     * Returns a predicate that represents the logical negation of this
     * predicate.
     *
     * @return a predicate that represents the logical negation of this
     * predicate.
     */

    default Predicate<T> negate() {
        return (t) -> !test(t);
    }

    /**
     * Returns a composed predicate that represents a short-circuiting logical
     * AND of this predicate and another. When evaluating the composed
     * predicate, if this predicate is {@code false}, then the {@code other}
     * predicate is not evaluated.
     * <p>Any exceptions thrown during evaluation of either predicate are relayed
     * to the caller; if evaluation of this predicate throws an exception, the
     * {@code other} predicate will not be evaluated.
     *
     * @param other a predicate that will be logically-ANDed with this
     *              predicate
     * @return a composed predicate that presents the short-circuitin logical
     * AND of this predicate and the {@code other} predicate
     * @throws NullPointerException – if other is null
     */

    default java.util.function.Predicate<T> and(java.util.function.Predicate<? super T> other) {

        Objects.requireNonNull(other);
        return (t) -> test(t) && other.test(t);

    }

}
