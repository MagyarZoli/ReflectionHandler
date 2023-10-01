package github.magyarzoli.junit4;

import github.magyarzoli.ReflectionHandler;
import org.junit.Test;

public class ReflectionHandlerNullPointerExceptionTest {

    @Test(expected = NullPointerException.class)
    public void reflectionTest() {
        ReflectionHandler reflectionHandler = new ReflectionHandler(null);
    }
}