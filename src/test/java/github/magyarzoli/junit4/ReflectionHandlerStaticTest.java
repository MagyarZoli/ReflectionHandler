package github.magyarzoli.junit4;

import github.magyarzoli.Example;
import github.magyarzoli.ExampleAnnotation;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

import static github.magyarzoli.ReflectionHandler.*;
import static org.junit.Assert.*;

public class ReflectionHandlerStaticTest {

    @Test
    public void reflectionFieldsTest() {
        Map<String, Field> map = reflectionFields(Example.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
        for (Map.Entry<String, Field> entry : map.entrySet()) {
            assertNotEquals(entry.getKey(), null);
            assertNotEquals(entry.getValue(), null);
        }
    }

    @Test
    public void reflectionFieldsAnnotationsTest() {
        Map<String, Field> map = reflectionFields(Example.class, ExampleAnnotation.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
        for (Map.Entry<String, Field> entry : map.entrySet()) {
            assertNotEquals(entry.getKey(), null);
            assertNotEquals(entry.getValue(), null);
        }
    }

    @Test
    public void reflectionConstructorsTest() {
        Map<String, Constructor<?>> map = reflectionConstructors(Example.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
        for (Map.Entry<String, Constructor<?>> entry : map.entrySet()) {
            assertNotEquals(entry.getKey(), null);
            assertNotEquals(entry.getValue(), null);
        }
    }

    @Test
    public void reflectionConstructorsAnnotationsTest() {
        Map<String, Constructor<?>> map = reflectionConstructors(Example.class, ExampleAnnotation.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
        for (Map.Entry<String, Constructor<?>> entry : map.entrySet()) {
            assertNotEquals(entry.getKey(), null);
            assertNotEquals(entry.getValue(), null);
        }
    }

    @Test
    public void reflectionMethodsTest() {
        Map<String, Method> map = reflectionMethods(Example.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
        for (Map.Entry<String, Method> entry : map.entrySet()) {
            assertNotEquals(entry.getKey(), null);
            assertNotEquals(entry.getValue(), null);
        }
    }

    @Test
    public void reflectionMethodsAnnotationsTest() {
        Map<String, Method> map = reflectionMethods(Example.class, ExampleAnnotation.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
        for (Map.Entry<String, Method> entry : map.entrySet()) {
            assertNotEquals(entry.getKey(), null);
            assertNotEquals(entry.getValue(), null);
        }
    }

    @Test
    public void reflectionClassesTest() {
        Map<String, Class<?>> map = reflectionClasses(Example.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
        for (Map.Entry<String, Class<?>> entry : map.entrySet()) {
            assertNotEquals(entry.getKey(), null);
            assertNotEquals(entry.getValue(), null);
        }
    }

    @Test
    public void reflectionClassesAnnotationTest() {
        Map<String, Class<?>> map = reflectionClasses(Example.class, ExampleAnnotation.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
        for (Map.Entry<String, Class<?>> entry : map.entrySet()) {
            assertNotEquals(entry.getKey(), null);
            assertNotEquals(entry.getValue(), null);
        }
    }

    @Test
    public void reflectionInterfacesTest() {
        Map<String, Class<?>> map = reflectionInterfaces(Example.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
        for (Map.Entry<String, Class<?>> entry : map.entrySet()) {
            assertNotEquals(entry.getKey(), null);
            assertNotEquals(entry.getValue(), null);
        }
    }

    @Test
    public void reflectionInterfacesAnnotationTest() {
        Map<String, Class<?>> map = reflectionInterfaces(Example.class, ExampleAnnotation.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
        for (Map.Entry<String, Class<?>> entry : map.entrySet()) {
            assertNotEquals(entry.getKey(), null);
            assertNotEquals(entry.getValue(), null);
        }
    }

    @Test
    public void reflectionEnumsTest() {
        Map<String, Class<?>> map = reflectionEnums(Example.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
        for (Map.Entry<String, Class<?>> entry : map.entrySet()) {
            assertNotEquals(entry.getKey(), null);
            assertNotEquals(entry.getValue(), null);
        }
    }

    @Test
    public void reflectionEnumsAnnotationTest() {
        Map<String, Class<?>> map = reflectionEnums(Example.class, ExampleAnnotation.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
        for (Map.Entry<String, Class<?>> entry : map.entrySet()) {
            assertNotEquals(entry.getKey(), null);
            assertNotEquals(entry.getValue(), null);
        }
    }

    @Test
    public void reflectionAnnotationsTest() {
        Map<String, Annotation> map = reflectionAnnotations(ExampleAnnotation.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
        for (Map.Entry<String, Annotation> entry : map.entrySet()) {
            assertNotEquals(entry.getKey(), null);
            assertNotEquals(entry.getValue(), null);
        }
    }

    @Test
    public <A extends AnnotatedElement> void reflectionAllTest() {
        Map<String, A> map = reflectionAll(Example.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
        for (Map.Entry<String, A> entry : map.entrySet()) {
            assertNotEquals(entry.getKey(), null);
            assertNotEquals(entry.getValue(), null);
        }
    }

    @Test
    public <A extends AnnotatedElement> void reflectionAllAnnotationsTest() {
        Map<String, A> map = reflectionAll(Example.class, ExampleAnnotation.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
        for (Map.Entry<String, A> entry : map.entrySet()) {
            assertNotEquals(entry.getKey(), null);
            assertNotEquals(entry.getValue(), null);
        }
    }
}