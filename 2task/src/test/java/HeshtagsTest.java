import static org.junit.jupiter.api.Assertions.*;

class HeshtagsTest {

    @org.junit.jupiter.api.Test
    void find(String a) {
        Boolean actual = a.contains("#");
        Boolean b = true;
        assertEquals(actual, b);
    }
}