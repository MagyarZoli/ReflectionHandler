package github.magyarzoli.junit5;

import github.magyarzoli.ExampleException;
import github.magyarzoli.ReflectionHandler;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


public class ReflectionHandlerAssertionFailedErrorTest {

    private ReflectionHandler reflectionHandler;

    @BeforeEach
    public void setUp() {
        reflectionHandler = new ReflectionHandler(ExampleException.class);
    }

    @Test
    public void reflectionFieldsExTest() {
        Map<String, Field> map = reflectionHandler.reflectionFields();
        assertNotNull(map);
        assertThrows(AssertionFailedError.class, () -> assertTrue(map.size() > 0));
    }

    @Test
    public void reflectionFieldsAnnotationsExTest() {
        Map<String, Field> map = reflectionHandler.reflectionFieldsAnnotations(SuppressWarnings.class);
        assertNotNull(map);
        assertThrows(AssertionFailedError.class, () -> assertTrue(map.size() > 0));
    }

    @Test
    public void reflectionConstructorsAnnotationsExTest() {
        Map<String, Constructor<?>> map = reflectionHandler.reflectionConstructorsAnnotations(SuppressWarnings.class);
        assertNotNull(map);
        assertThrows(AssertionFailedError.class, () -> assertTrue(map.size() > 0));
    }

    @Test
    public void reflectionMethodsExTest() {
        Map<String, Method> map = reflectionHandler.reflectionMethods();
        assertNotNull(map);
        assertThrows(AssertionFailedError.class, () -> assertTrue(map.size() > 0));
    }

    @Test
    public void reflectionMethodsAnnotationsExTest() {
        Map<String, Method> map = reflectionHandler.reflectionMethodsAnnotations(SuppressWarnings.class);
        assertNotNull(map);
        assertThrows(AssertionFailedError.class, () -> assertTrue(map.size() > 0));
    }

    @Test
    public void reflectionClassesExTest() {
        Map<String, Class<?>> map = reflectionHandler.reflectionClasses();
        assertNotNull(map);
        assertThrows(AssertionFailedError.class, () -> assertTrue(map.size() > 0));
    }

    @Test
    public void reflectionClassesAnnotationExTest() {
        Map<String, Class<?>> map = reflectionHandler.reflectionClassesAnnotations(SuppressWarnings.class);
        assertNotNull(map);
        assertThrows(AssertionFailedError.class, () -> assertTrue(map.size() > 0));
    }

    @Test
    public void reflectionInterfacesExTest() {
        Map<String, Class<?>> map = reflectionHandler.reflectionInterfaces();
        assertNotNull(map);
        assertThrows(AssertionFailedError.class, () -> assertTrue(map.size() > 0));
    }

    @Test
    public void reflectionInterfacesAnnotationExTest() {
        Map<String, Class<?>> map = reflectionHandler.reflectionInterfacesAnnotations(SuppressWarnings.class);
        assertNotNull(map);
        assertThrows(AssertionFailedError.class, () -> assertTrue(map.size() > 0));
    }

    @Test
    public void reflectionEnumsExTest() {
        Map<String, Class<?>> map = reflectionHandler.reflectionEnums();
        assertNotNull(map);
        assertThrows(AssertionFailedError.class, () -> assertTrue(map.size() > 0));
    }

    @Test
    public void reflectionEnumsAnnotationExTest() {
        Map<String, Class<?>> map = reflectionHandler.reflectionEnumsAnnotations(SuppressWarnings.class);
        assertNotNull(map);
        assertThrows(AssertionFailedError.class, () -> assertTrue(map.size() > 0));
    }

    @Test
    public <A extends AnnotatedElement> void reflectionAllAnnotationsExTest() {
        Map<String, A> map = reflectionHandler.reflectionAllAnnotations(SuppressWarnings.class);
        assertNotNull(map);
        assertThrows(AssertionFailedError.class, () -> assertTrue(map.size() > 0));
    }
}