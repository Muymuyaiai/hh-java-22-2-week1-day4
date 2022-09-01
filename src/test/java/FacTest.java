import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacTest {
    @Test
    void fac3 (){
        int i = 3;
        int actual = Fac.fac(i);
        assertEquals(6, actual);
    }
}
