package github.magyarzoli;

import lombok.*;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

@Getter
@Setter
@RequiredArgsConstructor
public class ReflectionHandler {

    @NonNull
    private Class<?> clazz;

    public Map<String, Field> reflectionFields() {
        return reflectionFields(clazz);
    }

    @SafeVarargs
    public final Map<String, Field> reflectionFieldsAnnotations(Class<? extends Annotation>... annotationClass) {
        return reflectionFields(clazz, annotationClass);
    }

    public Map<String, Constructor<?>> reflectionConstructors() {
        return reflectionConstructors(clazz);
    }

    @SafeVarargs
    public final Map<String, Constructor<?>> reflectionConstructorsAnnotations(Class<? extends Annotation>... annotationClass) {
        return reflectionConstructors(clazz, annotationClass);
    }

    public Map<String, Method> reflectionMethods() {
        return reflectionMethods(clazz);
    }

    @SafeVarargs
    public final Map<String, Method> reflectionMethodsAnnotations(Class<? extends Annotation>... annotationClass) {
        return reflectionMethods(clazz, annotationClass);
    }

    public Map<String, Class<?>> reflectionClasses() {
        return reflectionClasses(clazz);
    }

    @SafeVarargs
    public final Map<String, Class<?>> reflectionClassesAnnotations(Class<? extends Annotation>... annotationClass) {
        return reflectionClasses(clazz, annotationClass);
    }

    public Map<String, Class<?>> reflectionInterfaces() {
        return reflectionInterfaces(clazz);
    }

    @SafeVarargs
    public final Map<String, Class<?>> reflectionInterfacesAnnotations(Class<? extends Annotation>... annotationClass) {
        return reflectionInterfaces(clazz, annotationClass);
    }

    public Map<String, Class<?>> reflectionEnums() {
        return reflectionEnums(clazz);
    }

    @SafeVarargs
    public final Map<String, Class<?>> reflectionEnumsAnnotations(Class<? extends Annotation>... annotationClass) {
        return reflectionEnums(clazz, annotationClass);
    }

    public Map<String, Annotation> reflectionAnnotations() {
        return reflectionAnnotations(clazz);
    }

    public <A extends AnnotatedElement> Map<String, A> reflectionAll() {
        return reflectionAll(clazz);
    }

    @SafeVarargs
    public final <A extends AnnotatedElement> Map<String, A> reflectionAllAnnotations(
            Class<? extends Annotation>... annotationClass) {
        return reflectionAll(clazz, annotationClass);
    }

    public static Map<String, Field> reflectionFields(Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();
        Map<String, Field> fieldMap = new HashMap<>();
        for (Field field : fields) {
            field.setAccessible(true);
            fieldMap.put(field.getName(), field);
        }
        return fieldMap;
    }

    @SafeVarargs
    public static Map<String, Field> reflectionFields(Class<?> clazz, Class<? extends Annotation>... annotationClass) {
        Field[] fields = clazz.getDeclaredFields();
        Map<String, Field> fieldMap = new HashMap<>();
        for (Field field : fields) {
            field.setAccessible(true);
            for (Class<? extends Annotation> annotation : annotationClass) {
                if (field.isAnnotationPresent(annotation)) {
                    fieldMap.put(field.getName(), field);
                    break;
                }
            }
        }
        return fieldMap;
    }

    public static Map<String, Constructor<?>> reflectionConstructors(Class<?> clazz) {
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        Map<String, Constructor<?>> constructorMap = new HashMap<>();
        for (Constructor<?> constructor : constructors) {
            constructor.setAccessible(true);
            constructorMap.put(constructor.getName(), constructor);
        }
        return constructorMap;
    }

    @SafeVarargs
    public static Map<String, Constructor<?>> reflectionConstructors(
            Class<?> clazz, Class<? extends Annotation>... annotationClass) {
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        Map<String, Constructor<?>> constructorMap = new HashMap<>();
        for (Constructor<?> constructor : constructors) {
            constructor.setAccessible(true);
            for (Class<? extends Annotation> annotation : annotationClass) {
                if (constructor.isAnnotationPresent(annotation)) {
                    constructorMap.put(constructor.getName(), constructor);
                    break;
                }
            }
        }
        return constructorMap;
    }

    public static Map<String, Method> reflectionMethods(Class<?> clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        Map<String, Method> methodMap = new HashMap<>();
        for (Method method : methods) {
            method.setAccessible(true);
            methodMap.put(method.getName(), method);
        }
        return methodMap;
    }

    @SafeVarargs
    public static Map<String, Method> reflectionMethods(
            Class<?> clazz, Class<? extends Annotation>... annotationClass) {
        Method[] methods = clazz.getDeclaredMethods();
        Map<String, Method> methodMap = new HashMap<>();
        for (Method method : methods) {
            method.setAccessible(true);
            for (Class<? extends Annotation> annotation : annotationClass) {
                if (method.isAnnotationPresent(annotation)) {
                    methodMap.put(method.getName(), method);
                    break;
                }
            }
        }
        return methodMap;
    }

    public static Map<String, Class<?>> reflectionClasses(Class<?> clazz) {
        Class<?>[] classes = clazz.getDeclaredClasses();
        Map<String, Class<?>> classMap = new HashMap<>();
        for (Class<?> klass : classes) {
            classMap.put(klass.getName(), klass);
        }
        return classMap;
    }

    @SafeVarargs
    public static Map<String, Class<?>> reflectionClasses(
            Class<?> clazz, Class<? extends Annotation>... annotationClass) {
        Class<?>[] classes = clazz.getDeclaredClasses();
        Map<String, Class<?>> classMap = new HashMap<>();
        for (Class<?> klass : classes) {
            for (Class<? extends Annotation> annotation : annotationClass) {
                if (klass.isAnnotationPresent(annotation)) {
                    classMap.put(klass.getName(), klass);
                    break;
                }
            }
        }
        return classMap;
    }

    public static Map<String, Class<?>> reflectionInterfaces(Class<?> clazz) {
        Class<?>[] classes = clazz.getDeclaredClasses();
        Map<String, Class<?>> classMap = new HashMap<>();
        for (Class<?> klass : classes) {
            if (klass.isInterface()) {
                classMap.put(klass.getName(), klass);
            }
        }
        return classMap;
    }

    @SafeVarargs
    public static Map<String, Class<?>> reflectionInterfaces(
            Class<?> clazz, Class<? extends Annotation>... annotationClass) {
        Class<?>[] classes = clazz.getDeclaredClasses();
        Map<String, Class<?>> classMap = new HashMap<>();
        for (Class<?> klass : classes) {
            for (Class<? extends Annotation> annotation : annotationClass) {
                if (klass.isAnnotationPresent(annotation) && klass.isInterface()) {
                    classMap.put(klass.getName(), klass);
                    break;
                }
            }
        }
        return classMap;
    }

    public static Map<String, Class<?>> reflectionEnums(Class<?> clazz) {
        Class<?>[] classes = clazz.getDeclaredClasses();
        Map<String, Class<?>> classMap = new HashMap<>();
        for (Class<?> klass : classes) {
            if (klass.isEnum()) {
                classMap.put(klass.getName(), klass);
            }
        }
        return classMap;
    }

    @SafeVarargs
    public static Map<String, Class<?>> reflectionEnums(
            Class<?> clazz, Class<? extends Annotation>... annotationClass) {
        Class<?>[] classes = clazz.getDeclaredClasses();
        Map<String, Class<?>> classMap = new HashMap<>();
        for (Class<?> klass : classes) {
            for (Class<? extends Annotation> annotation : annotationClass) {
                if (klass.isAnnotationPresent(annotation) && klass.isEnum()) {
                    classMap.put(klass.getName(), klass);
                    break;
                }
            }
        }
        return classMap;
    }

    public static Map<String, Annotation> reflectionAnnotations(Class<?> clazz) {
        Annotation[] annotations = clazz.getDeclaredAnnotations();
        Map<String, Annotation> annotationMap = new HashMap<>();
        for (Annotation annotation : annotations) {
            annotationMap.put(annotation.toString(), annotation);
        }
        return annotationMap;
    }

    @SuppressWarnings("unchecked")
    public static <A extends AnnotatedElement> Map<String, A> reflectionAll(Class<?> clazz) {
        List<A> all = merge(
                (A[]) clazz.getDeclaredFields(),
                (A[]) clazz.getDeclaredConstructors(),
                (A[]) clazz.getDeclaredMethods(),
                (A[]) clazz.getDeclaredClasses());
        Map<String, A> allMap = new HashMap<>();
        for (A a : all) {
            allMap.put(a.toString(), a);
        }
        return allMap;
    }

    @SafeVarargs
    @SuppressWarnings("unchecked")
    public static <A extends AnnotatedElement> Map<String, A> reflectionAll(
            Class<?> clazz, Class<? extends Annotation>... annotationClass) {
        List<A> all = merge(
                (A[]) clazz.getDeclaredFields(),
                (A[]) clazz.getDeclaredConstructors(),
                (A[]) clazz.getDeclaredMethods(),
                (A[]) clazz.getDeclaredClasses());
        Map<String, A> allMap = new HashMap<>();
        for (A a : all) {
            for (Class<? extends Annotation> annotation : annotationClass) {
                if (a.isAnnotationPresent(annotation)) {
                    allMap.put(a.toString(), a);
                    break;
                }
            }
        }
        return allMap;
    }

    @SafeVarargs
    private static <A extends AnnotatedElement> List<A> merge(A[]... objects) {
        List<A> all = new ArrayList<>();
        for (A[] array : objects) {
            all.addAll(Arrays.asList(array));
        }
        return all;
    }
}