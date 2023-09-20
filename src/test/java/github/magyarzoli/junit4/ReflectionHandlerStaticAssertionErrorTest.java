package github.magyarzoli.junit4;

import github.magyarzoli.Example;
import github.magyarzoli.ExampleAnnotation;
import github.magyarzoli.ExampleException;
import org.junit.Test;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

import static github.magyarzoli.ReflectionHandler.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ReflectionHandlerStaticAssertionErrorTest {

    @Test(expected = AssertionError.class)
    public void reflectionFieldsExTest() {
        Map<String, Field> map = reflectionFields(ExampleException.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = AssertionError.class)
    public void reflectionFieldsExAnnotationsTest() {
        Map<String, Field> map = reflectionFields(ExampleException.class, ExampleAnnotation.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = AssertionError.class)
    public void reflectionFieldsAnnotationsExTest() {
        Map<String, Field> map = reflectionFields(Example.class, SuppressWarnings.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = AssertionError.class)
    public void reflectionConstructorsExAnnotationsTest() {
        Map<String, Constructor<?>> map = reflectionConstructors(ExampleException.class, ExampleAnnotation.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = AssertionError.class)
    public void reflectionConstructorsAnnotationsExTest() {
        Map<String, Constructor<?>> map = reflectionConstructors(Example.class, SuppressWarnings.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = AssertionError.class)
    public void reflectionMethodsExTest() {
        Map<String, Method> map = reflectionMethods(ExampleException.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = AssertionError.class)
    public void reflectionMethodsExAnnotationsTest() {
        Map<String, Method> map = reflectionMethods(ExampleException.class, ExampleAnnotation.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = AssertionError.class)
    public void reflectionMethodsAnnotationsExTest() {
        Map<String, Method> map = reflectionMethods(Example.class, SuppressWarnings.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = AssertionError.class)
    public void reflectionClassesExTest() {
        Map<String, Class<?>> map = reflectionClasses(ExampleException.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = AssertionError.class)
    public void reflectionClassesExAnnotationTest() {
        Map<String, Class<?>> map = reflectionClasses(ExampleException.class, ExampleAnnotation.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = AssertionError.class)
    public void reflectionClassesAnnotationExTest() {
        Map<String, Class<?>> map = reflectionClasses(Example.class, SuppressWarnings.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = AssertionError.class)
    public void reflectionInterfacesExTest() {
        Map<String, Class<?>> map = reflectionInterfaces(ExampleException.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = AssertionError.class)
    public void reflectionInterfacesExAnnotationTest() {
        Map<String, Class<?>> map = reflectionInterfaces(ExampleException.class, ExampleAnnotation.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = AssertionError.class)
    public void reflectionInterfacesAnnotationExTest() {
        Map<String, Class<?>> map = reflectionInterfaces(Example.class, SuppressWarnings.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = AssertionError.class)
    public void reflectionEnumsExTest() {
        Map<String, Class<?>> map = reflectionEnums(ExampleException.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = AssertionError.class)
    public void reflectionEnumsExAnnotationTest() {
        Map<String, Class<?>> map = reflectionEnums(ExampleException.class, ExampleAnnotation.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = AssertionError.class)
    public void reflectionEnumsAnnotationExTest() {
        Map<String, Class<?>> map = reflectionEnums(Example.class, SuppressWarnings.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = AssertionError.class)
    public <A extends AnnotatedElement> void reflectionAllExAnnotationsTest() {
        Map<String, A> map = reflectionAll(ExampleException.class, ExampleAnnotation.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = AssertionError.class)
    public <A extends AnnotatedElement> void reflectionAllAnnotationsExTest() {
        Map<String, A> map = reflectionAll(Example.class, SuppressWarnings.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }
}