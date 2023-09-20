package github.magyarzoli.junit5;

import github.magyarzoli.Example;
import github.magyarzoli.ExampleAnnotation;
import github.magyarzoli.ExampleException;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

import static github.magyarzoli.ReflectionHandler.*;
import static org.junit.jupiter.api.Assertions.*;

public class ReflectionHandlerStaticAssertionFailedErrorTest {

    @Test
    public void reflectionFieldsExTest() {
        Map<String, Field> map = reflectionFields(ExampleException.class);
        assertNotNull(map);
        assertThrows(AssertionFailedError.class, () -> assertTrue(map.size() > 0));
    }

    @Test
    public void reflectionFieldsExAnnotationsTest() {
        Map<String, Field> map = reflectionFields(ExampleException.class, ExampleAnnotation.class);
        assertNotNull(map);
        assertThrows(AssertionFailedError.class, () -> assertTrue(map.size() > 0));
    }

    @Test
    public void reflectionFieldsAnnotationsExTest() {
        Map<String, Field> map = reflectionFields(Example.class, SuppressWarnings.class);
        assertNotNull(map);
        assertThrows(AssertionFailedError.class, () -> assertTrue(map.size() > 0));
    }

    @Test
    public void reflectionConstructorsExAnnotationsTest() {
        Map<String, Constructor<?>> map = reflectionConstructors(ExampleException.class, ExampleAnnotation.class);
        assertNotNull(map);
        assertThrows(AssertionFailedError.class, () -> assertTrue(map.size() > 0));
    }

    @Test
    public void reflectionConstructorsAnnotationsExTest() {
        Map<String, Constructor<?>> map = reflectionConstructors(Example.class, SuppressWarnings.class);
        assertNotNull(map);
        assertThrows(AssertionFailedError.class, () -> assertTrue(map.size() > 0));
    }

    @Test
    public void reflectionMethodsExTest() {
        Map<String, Method> map = reflectionMethods(ExampleException.class);
        assertNotNull(map);
        assertThrows(AssertionFailedError.class, () -> assertTrue(map.size() > 0));
    }

    @Test
    public void reflectionMethodsExAnnotationsTest() {
        Map<String, Method> map = reflectionMethods(ExampleException.class, ExampleAnnotation.class);
        assertNotNull(map);
        assertThrows(AssertionFailedError.class, () -> assertTrue(map.size() > 0));
    }

    @Test
    public void reflectionMethodsAnnotationsExTest() {
        Map<String, Method> map = reflectionMethods(Example.class, SuppressWarnings.class);
        assertNotNull(map);
        assertThrows(AssertionFailedError.class, () -> assertTrue(map.size() > 0));
    }

    @Test
    public void reflectionClassesExTest() {
        Map<String, Class<?>> map = reflectionClasses(ExampleException.class);
        assertNotNull(map);
        assertThrows(AssertionFailedError.class, () -> assertTrue(map.size() > 0));
    }

    @Test
    public void reflectionClassesExAnnotationTest() {
        Map<String, Class<?>> map = reflectionClasses(ExampleException.class, ExampleAnnotation.class);
        assertNotNull(map);
        assertThrows(AssertionFailedError.class, () -> assertTrue(map.size() > 0));
    }

    @Test
    public void reflectionClassesAnnotationExTest() {
        Map<String, Class<?>> map = reflectionClasses(Example.class, SuppressWarnings.class);
        assertNotNull(map);
        assertThrows(AssertionFailedError.class, () -> assertTrue(map.size() > 0));
    }

    @Test
    public void reflectionInterfacesExTest() {
        Map<String, Class<?>> map = reflectionInterfaces(ExampleException.class);
        assertNotNull(map);
        assertThrows(AssertionFailedError.class, () -> assertTrue(map.size() > 0));
    }

    @Test
    public void reflectionInterfacesExAnnotationTest() {
        Map<String, Class<?>> map = reflectionInterfaces(ExampleException.class, ExampleAnnotation.class);
        assertNotNull(map);
        assertThrows(AssertionFailedError.class, () -> assertTrue(map.size() > 0));
    }

    @Test
    public void reflectionInterfacesAnnotationExTest() {
        Map<String, Class<?>> map = reflectionInterfaces(Example.class, SuppressWarnings.class);
        assertNotNull(map);
        assertThrows(AssertionFailedError.class, () -> assertTrue(map.size() > 0));
    }

    @Test
    public void reflectionEnumsExTest() {
        Map<String, Class<?>> map = reflectionEnums(ExampleException.class);
        assertNotNull(map);
        assertThrows(AssertionFailedError.class, () -> assertTrue(map.size() > 0));
    }

    @Test
    public void reflectionEnumsExAnnotationTest() {
        Map<String, Class<?>> map = reflectionEnums(ExampleException.class, ExampleAnnotation.class);
        assertNotNull(map);
        assertThrows(AssertionFailedError.class, () -> assertTrue(map.size() > 0));
    }

    @Test
    public void reflectionEnumsAnnotationExTest() {
        Map<String, Class<?>> map = reflectionEnums(Example.class, SuppressWarnings.class);
        assertNotNull(map);
        assertThrows(AssertionFailedError.class, () -> assertTrue(map.size() > 0));
    }

    @Test
    public <A extends AnnotatedElement> void reflectionAllExAnnotationsTest() {
        Map<String, A> map = reflectionAll(ExampleException.class, ExampleAnnotation.class);
        assertNotNull(map);
        assertThrows(AssertionFailedError.class, () -> assertTrue(map.size() > 0));
    }

    @Test
    public <A extends AnnotatedElement> void reflectionAllAnnotationsExTest() {
        Map<String, A> map = reflectionAll(Example.class, SuppressWarnings.class);
        assertNotNull(map);
        assertThrows(AssertionFailedError.class, () -> assertTrue(map.size() > 0));
    }
}