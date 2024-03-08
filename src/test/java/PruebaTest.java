import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PruebaTest {

    @Test
    public void test01() {
        var list = new ArrayList<>();
        list.add("hola");
        list.add("mundo");
        assertTrue(list.contains("hola"));
    }
}
