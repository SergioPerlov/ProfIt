import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @org.junit.jupiter.api.Test
    void calc() {
        Numbers n = new Numbers();
        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            a.add((int)(Math.random()*20-10));

        }
        for (int i = 0; i < 10; i++) {
            System.out.println("a = " + a.get(i));
        }

    }
}