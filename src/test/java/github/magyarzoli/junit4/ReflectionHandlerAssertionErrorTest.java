package github.magyarzoli.junit4;

import github.magyarzoli.ExampleException;
import github.magyarzoli.ReflectionHandler;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ReflectionHandlerAssertionErrorTest {

    private ReflectionHandler reflectionHandler;

    @Before
    public void setUp() {
        reflectionHandler = new ReflectionHandler(ExampleException.class);
    }

    @Test(expected = AssertionError.class)
    public void reflectionFieldsExTest() {
        Map<String, Field> map = reflectionHandler.reflectionFields();
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = AssertionError.class)
    public void reflectionFieldsAnnotationsExTest() {
        Map<String, Field> map = reflectionHandler.reflectionFieldsAnnotations(SuppressWarnings.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = AssertionError.class)
    public void reflectionConstructorsAnnotationsExTest() {
        Map<String, Constructor<?>> map = reflectionHandler.reflectionConstructorsAnnotations(SuppressWarnings.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = AssertionError.class)
    public void reflectionMethodsExTest() {
        Map<String, Method> map = reflectionHandler.reflectionMethods();
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = AssertionError.class)
    public void reflectionMethodsAnnotationsExTest() {
        Map<String, Method> map = reflectionHandler.reflectionMethodsAnnotations(SuppressWarnings.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = AssertionError.class)
    public void reflectionClassesExTest() {
        Map<String, Class<?>> map = reflectionHandler.reflectionClasses();
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = AssertionError.class)
    public void reflectionClassesAnnotationExTest() {
        Map<String, Class<?>> map = reflectionHandler.reflectionClassesAnnotations(SuppressWarnings.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = AssertionError.class)
    public void reflectionInterfacesExTest() {
        Map<String, Class<?>> map = reflectionHandler.reflectionInterfaces();
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = AssertionError.class)
    public void reflectionInterfacesAnnotationExTest() {
        Map<String, Class<?>> map = reflectionHandler.reflectionInterfacesAnnotations(SuppressWarnings.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = AssertionError.class)
    public void reflectionEnumsExTest() {
        Map<String, Class<?>> map = reflectionHandler.reflectionEnums();
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = AssertionError.class)
    public void reflectionEnumsAnnotationExTest() {
        Map<String, Class<?>> map = reflectionHandler.reflectionEnumsAnnotations(SuppressWarnings.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = AssertionError.class)
    public <A extends AnnotatedElement> void reflectionAllAnnotationsExTest() {
        Map<String, A> map = reflectionHandler.reflectionAllAnnotations(SuppressWarnings.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }
}