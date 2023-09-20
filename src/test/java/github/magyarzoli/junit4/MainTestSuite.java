package github.magyarzoli.junit4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ReflectionHandlerStaticTest.class,
        ReflectionHandlerTest.class,
        ReflectionHandlerStaticNullPointerExceptionTest.class,
        ReflectionHandlerNullPointerExceptionTest.class,
        ReflectionHandlerStaticAssertionErrorTest.class,
        ReflectionHandlerAssertionErrorTest.class
})
public class MainTestSuite {}