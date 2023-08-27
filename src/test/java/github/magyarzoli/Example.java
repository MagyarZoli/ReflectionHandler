package github.magyarzoli;

import lombok.*;

@AllArgsConstructor
@Builder
public class Example {

    @Getter(value = AccessLevel.PACKAGE)
    @Setter(value = AccessLevel.PRIVATE)
    @ExampleAnnotation
    private Integer fieldA = 10;

    @Getter(value = AccessLevel.PROTECTED)
    @Setter(value = AccessLevel.PRIVATE)
    @NonNull
    private String field;

    @ExampleAnnotation
    private Example() {}

    private void method() {
        System.out.println("private method");
    }

    @ExampleAnnotation
    private void methodA() {
        System.out.println("Annotated the private method");
    }

    @Data
    private static class Clazz {

        private Double field;
    }

    @Data
    @ExampleAnnotation
    private static class ClazzA {

        private Long field;
    }

    private interface Interface {

        void method();
    }

    @ExampleAnnotation
    private interface InterfaceA {

        void method();
    }

    private enum Enum {
        VALUE, VALUE2
    }

    @ExampleAnnotation
    private enum EnumA {
        VALUE, VALUE2
    }
}