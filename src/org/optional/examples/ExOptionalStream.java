package org.optional.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ExOptionalStream {

    public static void main(String[] args) {

        Stream<Integer> stream = Optional.of(192).stream();
        stream.forEach(System.out::println);

        Stream<Object> streamE = Optional.empty().stream();
        System.out.println(streamE.count());

        List<String> napisy = Arrays.asList("ala", null, "ma", null, "kota");

        //streams
        //java8
        napisy.stream()
                .map(Optional::ofNullable)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .forEach(System.out::println);

        //java9
        napisy.stream()
                .map(Optional::ofNullable)
                .flatMap(Optional::stream)
                .forEach(System.out::println);

    }
}
