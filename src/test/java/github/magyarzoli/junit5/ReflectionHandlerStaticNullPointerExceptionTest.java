package github.magyarzoli.junit5;

import github.magyarzoli.Example;
import github.magyarzoli.ExampleAnnotation;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

import static github.magyarzoli.ReflectionHandler.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ReflectionHandlerStaticNullPointerExceptionTest {

    @Test
    public void reflectionFieldsExTest() {
        AtomicReference<Map<String, Field>> map = new AtomicReference<>();
        assertThrows(NullPointerException.class, () -> map.set(reflectionFields(null)));
    }

    @Test
    public void reflectionFieldsExAnnotationsTest() {
        AtomicReference<Map<String, Field>> map = new AtomicReference<>();
        assertThrows(NullPointerException.class, () -> map.set(reflectionFields(null, ExampleAnnotation.class)));
    }

    @Test
    public void reflectionFieldsAnnotationsExTest() {
        AtomicReference<Map<String, Field>> map = new AtomicReference<>();
        assertThrows(NullPointerException.class, () -> map.set(reflectionFields(Example.class, null)));
    }

    @Test
    public void reflectionConstructorsExTest() {
        AtomicReference<Map<String, Constructor<?>>> map = new AtomicReference<>();
        assertThrows(NullPointerException.class, () -> map.set(reflectionConstructors(null)));
    }

    @Test
    public void reflectionConstructorsExAnnotationsTest() {
        AtomicReference<Map<String, Constructor<?>>> map = new AtomicReference<>();
        assertThrows(NullPointerException.class, () ->
                map.set(reflectionConstructors(null, ExampleAnnotation.class)));
    }

    @Test
    public void reflectionConstructorsAnnotationsExTest() {
        AtomicReference<Map<String, Constructor<?>>> map = new AtomicReference<>();
        assertThrows(NullPointerException.class, () ->
                map.set(reflectionConstructors(Example.class, null)));
    }

    @Test
    public void reflectionMethodsExTest() {
        AtomicReference<Map<String, Method>> map = new AtomicReference<>();
        assertThrows(NullPointerException.class, () -> map.set(reflectionMethods(null)));
    }

    @Test
    public void reflectionMethodsExAnnotationsTest() {
        AtomicReference<Map<String, Method>> map = new AtomicReference<>();
        assertThrows(NullPointerException.class, () -> map.set(reflectionMethods(null, ExampleAnnotation.class)));
    }

    @Test
    public void reflectionMethodsAnnotationsExTest() {
        AtomicReference<Map<String, Method>> map = new AtomicReference<>();
        assertThrows(NullPointerException.class, () -> map.set(reflectionMethods(Example.class, null)));
    }

    @Test
    public void reflectionClassesExTest() {
        AtomicReference<Map<String, Class<?>>> map = new AtomicReference<>();
        assertThrows(NullPointerException.class, () -> map.set(reflectionClasses(null)));

    }

    @Test
    public void reflectionClassesExAnnotationTest() {
        AtomicReference<Map<String, Class<?>>> map = new AtomicReference<>();
        assertThrows(NullPointerException.class, () -> map.set(reflectionClasses(null, ExampleAnnotation.class)));
    }

    @Test
    public void reflectionClassesAnnotationExTest() {
        AtomicReference<Map<String, Class<?>>> map = new AtomicReference<>();
        assertThrows(NullPointerException.class, () -> map.set(reflectionClasses(Example.class, null)));
    }

    @Test
    public void reflectionInterfacesExTest() {
        AtomicReference<Map<String, Class<?>>> map = new AtomicReference<>();
        assertThrows(NullPointerException.class, () -> map.set(reflectionInterfaces(null)));
    }

    @Test
    public void reflectionInterfacesExAnnotationTest() {
        AtomicReference<Map<String, Class<?>>> map = new AtomicReference<>();
        assertThrows(NullPointerException.class, () ->
                map.set(reflectionInterfaces(null, ExampleAnnotation.class)));
    }

    @Test
    public void reflectionInterfacesAnnotationExTest() {
        AtomicReference<Map<String, Class<?>>> map = new AtomicReference<>();
        assertThrows(NullPointerException.class, () ->
                map.set(reflectionInterfaces(Example.class, null)));
    }

    @Test
    public void reflectionEnumsExTest() {
        AtomicReference<Map<String, Class<?>>> map = new AtomicReference<>();
        assertThrows(NullPointerException.class, () -> map.set(reflectionEnums(null)));
    }

    @Test
    public void reflectionEnumsExAnnotationTest() {
        AtomicReference<Map<String, Class<?>>> map = new AtomicReference<>();
        assertThrows(NullPointerException.class, () -> map.set(reflectionEnums(null, ExampleAnnotation.class)));
    }

    @Test
    public void reflectionEnumsAnnotationExTest() {
        AtomicReference<Map<String, Class<?>>> map = new AtomicReference<>();
        assertThrows(NullPointerException.class, () -> map.set(reflectionEnums(Example.class, null)));
    }

    @Test
    public void reflectionAnnotationsTest() {
        AtomicReference<Map<String, Annotation>> map = new AtomicReference<>();
        assertThrows(NullPointerException.class, () -> map.set(reflectionAnnotations(null)));
    }

    @Test
    public <A extends AnnotatedElement> void reflectionAllExTest() {
        AtomicReference<Map<String, A>> map = new AtomicReference<>();
        assertThrows(NullPointerException.class, () -> map.set(reflectionAll(null)));
    }

    @Test
    public <A extends AnnotatedElement> void reflectionAllExAnnotationsTest() {
        AtomicReference<Map<String, A>> map = new AtomicReference<>();
        assertThrows(NullPointerException.class, () -> map.set(reflectionAll(null, ExampleAnnotation.class)));
    }

    @Test
    public <A extends AnnotatedElement> void reflectionAllAnnotationsExTest() {
        AtomicReference<Map<String, A>> map = new AtomicReference<>();
        assertThrows(NullPointerException.class, () -> map.set(reflectionAll(Example.class, null)));
    }
}