package github.magyarzoli.junit5;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        ReflectionHandlerStaticTest.class,
        ReflectionHandlerTest.class,
        ReflectionHandlerStaticNullPointerExceptionTest.class,
        ReflectionHandlerNullPointerExceptionTest.class,
        ReflectionHandlerStaticAssertionFailedErrorTest.class,
        ReflectionHandlerAssertionFailedErrorTest.class
})
public class MainTestSuite {}