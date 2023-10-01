package github.magyarzoli.junit5;

import github.magyarzoli.ReflectionHandler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ReflectionHandlerNullPointerExceptionTest {

    private ReflectionHandler reflectionHandler;

    @Test
    public void reflectionTest() {
        assertThrows(NullPointerException.class, () -> reflectionHandler = new ReflectionHandler(null));
    }
}