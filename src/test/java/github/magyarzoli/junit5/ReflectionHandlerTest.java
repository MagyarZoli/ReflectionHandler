package github.magyarzoli.junit5;

import github.magyarzoli.Example;
import github.magyarzoli.ExampleAnnotation;
import github.magyarzoli.ReflectionHandler;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class ReflectionHandlerTest {

    private ReflectionHandler reflectionHandler;

    @BeforeEach
    public void setUp() {
        reflectionHandler = new ReflectionHandler(Example.class);
    }

    @Test
    public void reflectionFieldsTest() {
        Map<String, Field> map = reflectionHandler.reflectionFields();
        assertNotNull(map);
        assertTrue(map.size() > 0);
        for (Map.Entry<String, Field> entry : map.entrySet()) {
            assertNotEquals(entry.getKey(), null);
            assertNotEquals(entry.getValue(), null);
        }
    }

    @Test
    public void reflectionFieldsAnnotationsTest() {
        Map<String, Field> map = reflectionHandler.reflectionFieldsAnnotations(ExampleAnnotation.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
        for (Map.Entry<String, Field> entry : map.entrySet()) {
            assertNotEquals(entry.getKey(), null);
            assertNotEquals(entry.getValue(), null);
        }
    }

    @Test
    public void reflectionConstructorsTest() {
        Map<String, Constructor<?>> map = reflectionHandler.reflectionConstructors();
        assertNotNull(map);
        assertTrue(map.size() > 0);
        for (Map.Entry<String, Constructor<?>> entry : map.entrySet()) {
            assertNotEquals(entry.getKey(), null);
            assertNotEquals(entry.getValue(), null);
        }
    }

    @Test
    public void reflectionConstructorsAnnotationsTest() {
        Map<String, Constructor<?>> map = reflectionHandler.reflectionConstructorsAnnotations(ExampleAnnotation.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
        for (Map.Entry<String, Constructor<?>> entry : map.entrySet()) {
            assertNotEquals(entry.getKey(), null);
            assertNotEquals(entry.getValue(), null);
        }
    }

    @Test
    public void reflectionMethodsTest() {
        Map<String, Method> map = reflectionHandler.reflectionMethods();
        assertNotNull(map);
        assertTrue(map.size() > 0);
        for (Map.Entry<String, Method> entry : map.entrySet()) {
            assertNotEquals(entry.getKey(), null);
            assertNotEquals(entry.getValue(), null);
        }
    }

    @Test
    public void reflectionMethodsAnnotationsTest() {
        Map<String, Method> map = reflectionHandler.reflectionMethodsAnnotations(ExampleAnnotation.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
        for (Map.Entry<String, Method> entry : map.entrySet()) {
            assertNotEquals(entry.getKey(), null);
            assertNotEquals(entry.getValue(), null);
        }
    }

    @Test
    public void reflectionClassesTest() {
        Map<String, Class<?>> map = reflectionHandler.reflectionClasses();
        assertNotNull(map);
        assertTrue(map.size() > 0);
        for (Map.Entry<String, Class<?>> entry : map.entrySet()) {
            assertNotEquals(entry.getKey(), null);
            assertNotEquals(entry.getValue(), null);
        }
    }

    @Test
    public void reflectionClassesAnnotationTest() {
        Map<String, Class<?>> map = reflectionHandler.reflectionClassesAnnotations(ExampleAnnotation.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
        for (Map.Entry<String, Class<?>> entry : map.entrySet()) {
            assertNotEquals(entry.getKey(), null);
            assertNotEquals(entry.getValue(), null);
        }
    }

    @Test
    public void reflectionInterfacesTest() {
        Map<String, Class<?>> map = reflectionHandler.reflectionInterfaces();
        assertNotNull(map);
        assertTrue(map.size() > 0);
        for (Map.Entry<String, Class<?>> entry : map.entrySet()) {
            assertNotEquals(entry.getKey(), null);
            assertNotEquals(entry.getValue(), null);
        }
    }

    @Test
    public void reflectionInterfacesAnnotationTest() {
        Map<String, Class<?>> map = reflectionHandler.reflectionInterfacesAnnotations(ExampleAnnotation.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
        for (Map.Entry<String, Class<?>> entry : map.entrySet()) {
            assertNotEquals(entry.getKey(), null);
            assertNotEquals(entry.getValue(), null);
        }
    }

    @Test
    public void reflectionEnumsTest() {
        Map<String, Class<?>> map = reflectionHandler.reflectionEnums();
        assertNotNull(map);
        assertTrue(map.size() > 0);
        for (Map.Entry<String, Class<?>> entry : map.entrySet()) {
            assertNotEquals(entry.getKey(), null);
            assertNotEquals(entry.getValue(), null);
        }
    }

    @Test
    public void reflectionEnumsAnnotationTest() {
        Map<String, Class<?>> map = reflectionHandler.reflectionEnumsAnnotations(ExampleAnnotation.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
        for (Map.Entry<String, Class<?>> entry : map.entrySet()) {
            assertNotEquals(entry.getKey(), null);
            assertNotEquals(entry.getValue(), null);
        }
    }

    @Test
    public <A extends AnnotatedElement> void reflectionAllTest() {
        Map<String, A> map = reflectionHandler.reflectionAll();
        assertNotNull(map);
        assertTrue(map.size() > 0);
        for (Map.Entry<String, A> entry : map.entrySet()) {
            assertNotEquals(entry.getKey(), null);
            assertNotEquals(entry.getValue(), null);
        }
    }

    @Test
    public <A extends AnnotatedElement> void reflectionAllAnnotationsTest() {
        Map<String, A> map = reflectionHandler.reflectionAllAnnotations(ExampleAnnotation.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
        for (Map.Entry<String, A> entry : map.entrySet()) {
            assertNotEquals(entry.getKey(), null);
            assertNotEquals(entry.getValue(), null);
        }
    }
}