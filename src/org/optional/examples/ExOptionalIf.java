package org.optional.examples;

import java.util.Optional;

public class ExOptionalIf {

    private void ifPresentOrElseEx(String napis) {
        Optional<String> opt = Optional.ofNullable(napis);
        opt.ifPresentOrElse(
                (s) -> System.out.println(s + " tak"),
                () -> System.out.println("nic nie ma")
        );
    }

    public static void main(String[] args) {
        ExOptionalIf o = new ExOptionalIf();
        o.ifPresentOrElseEx("to jest napis");
        o.ifPresentOrElseEx(null);
   }
}
