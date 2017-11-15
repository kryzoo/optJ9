package org.optional.examples;

import java.util.Optional;

public class Examples {


    /*
        Reports any uses of java.util.Optional<T>, java.util.OptionalDouble, java.util.OptionalInt, java.util.OptionalLong or
        com.google.common.base.Optional as the type for a field or a parameter.
        Optional was designed to provide a limited mechanism for library method return types where there needed
        to be a clear way to represent "no result". Using a field with type java.util.Optional is also problematic
        if the class needs to be Serializable, which java.util.Optional is not.
    */
    boolean isEven(Optional<Long> value) {
//        Optional<Long> value = Optional.ofNullable(valueOpt).flatMap(Function.identity());
        if (value.isPresent()){
            return value.get() % 2 == 0;
        }
        throw new RuntimeException("no argument");
    }

    Optional<Boolean> isEven2(Long value) {
        return Optional.ofNullable(value)
                .map(v -> v % 2 == 0);
    }

    public static void main(String[] args) {
	// write your code here
    }
}
