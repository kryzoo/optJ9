package org.optional.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ExOptionalOr {

    public static void main(String[] args) {
        ExOptionalOr o = new ExOptionalOr();
        Optional<Integer> optint = Optional.of(196);

        //or
        System.out.println(optint.or(() -> Optional.of(99)));
        System.out.println(Optional.empty().or(() -> Optional.of(99)));
    }
}
