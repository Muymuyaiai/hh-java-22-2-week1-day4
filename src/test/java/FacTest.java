import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacTest {
    @Test
    void fac3 (){
        int i = 3;
        int actual = Fac.fac2(i);
        assertEquals(6, actual);
    }

    @Test
    void fac4 (){
        int i = 4;
        int actual = Fac.fac2(i);
        assertEquals(24, actual);
    }

    @Test
    void fac12 (){
        int i = 12;
        int actual = Fac.fac2(i);
        assertEquals(479001600, actual);
    }

    @Test
    void fac0 (){
        int i = 0;
        int actual = Fac.fac2(i);
        assertEquals(1, actual);
    }
}
