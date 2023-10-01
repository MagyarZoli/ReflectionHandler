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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ReflectionHandlerStaticNullPointerExceptionTest {

    @Test(expected = NullPointerException.class)
    public void reflectionFieldsExTest() {
        Map<String, Field> map = reflectionFields(null);
    }

    @Test(expected = NullPointerException.class)
    public void reflectionFieldsExAnnotationsTest() {
        Map<String, Field> map = reflectionFields(null, ExampleAnnotation.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = NullPointerException.class)
    public void reflectionFieldsAnnotationsExTest() {
        Map<String, Field> map = reflectionFields(Example.class, null);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = NullPointerException.class)
    public void reflectionConstructorsExTest() {
        Map<String, Constructor<?>> map = reflectionConstructors(null);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = NullPointerException.class)
    public void reflectionConstructorsExAnnotationsTest() {
        Map<String, Constructor<?>> map = reflectionConstructors(null, ExampleAnnotation.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = NullPointerException.class)
    public void reflectionConstructorsAnnotationsExTest() {
        Map<String, Constructor<?>> map = reflectionConstructors(Example.class, null);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = NullPointerException.class)
    public void reflectionMethodsExTest() {
        Map<String, Method> map = reflectionMethods(null);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = NullPointerException.class)
    public void reflectionMethodsExAnnotationsTest() {
        Map<String, Method> map = reflectionMethods(null, ExampleAnnotation.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = NullPointerException.class)
    public void reflectionMethodsAnnotationsExTest() {
        Map<String, Method> map = reflectionMethods(Example.class, null);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = NullPointerException.class)
    public void reflectionClassesExTest() {
        Map<String, Class<?>> map = reflectionClasses(null);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = NullPointerException.class)
    public void reflectionClassesExAnnotationTest() {
        Map<String, Class<?>> map = reflectionClasses(null, ExampleAnnotation.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = NullPointerException.class)
    public void reflectionClassesAnnotationExTest() {
        Map<String, Class<?>> map = reflectionClasses(Example.class, null);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = NullPointerException.class)
    public void reflectionInterfacesExTest() {
        Map<String, Class<?>> map = reflectionInterfaces(null);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = NullPointerException.class)
    public void reflectionInterfacesExAnnotationTest() {
        Map<String, Class<?>> map = reflectionInterfaces(null, ExampleAnnotation.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = NullPointerException.class)
    public void reflectionInterfacesAnnotationExTest() {
        Map<String, Class<?>> map = reflectionInterfaces(Example.class, null);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = NullPointerException.class)
    public void reflectionEnumsExTest() {
        Map<String, Class<?>> map = reflectionEnums(null);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = NullPointerException.class)
    public void reflectionEnumsExAnnotationTest() {
        Map<String, Class<?>> map = reflectionEnums(null, ExampleAnnotation.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = NullPointerException.class)
    public void reflectionEnumsAnnotationExTest() {
        Map<String, Class<?>> map = reflectionEnums(Example.class, null);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = NullPointerException.class)
    public void reflectionAnnotationsTest() {
        Map<String, Annotation> map = reflectionAnnotations(null);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = NullPointerException.class)
    public <A extends AnnotatedElement> void reflectionAllExTest() {
        Map<String, A> map = reflectionAll(null);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = NullPointerException.class)
    public <A extends AnnotatedElement> void reflectionAllExAnnotationsTest() {
        Map<String, A> map = reflectionAll(null, ExampleAnnotation.class);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }

    @Test(expected = NullPointerException.class)
    public <A extends AnnotatedElement> void reflectionAllAnnotationsExTest() {
        Map<String, A> map = reflectionAll(Example.class, null);
        assertNotNull(map);
        assertTrue(map.size() > 0);
    }
}