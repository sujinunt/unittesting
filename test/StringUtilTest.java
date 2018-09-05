import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests of the StringUtil methods.
 */
public class StringUtilTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testIndexOf() {
        String[] fruit = {"Apple", "Banana", "Grapes"};
        assertEquals(0, StringUtil.indexOf("Apple", fruit));
    }

    @Test
    public void testIndexOf2() {
        String[] fruit = {"Apple", "Banana", "Grapes"};
        assertEquals(1, StringUtil.indexOf("Banana", fruit));
    }

    @Test
    public void testStringNotInArray() {
        String[] fruit = {"Apple", "Banana", "Grapes"};
        assertEquals(-1, StringUtil.indexOf("Tomato", fruit));
    }

    @Test
    public void testNoIndex() {
        String[] fruit = {};
        assertEquals(-1, StringUtil.indexOf("Banana", fruit));
    }

    @Test
    public void testAllCapitalize() {
        String[] fruit = {"Apple", "Banana", "Grapes"};
        assertEquals(1, StringUtil.indexOf("BANANA", fruit));
    }

    @Test
    public void testAllLowercase() {
        String[] fruit = {"Apple", "Banana", "Grapes"};
        assertEquals(2, StringUtil.indexOf("grapes", fruit));
    }

    @Test
    public void testRandomCapitalize() {
        String[] fruit = {"Apple", "Banana", "Grapes"};
        assertEquals(0, StringUtil.indexOf("ApPlE", fruit));
    }

}
