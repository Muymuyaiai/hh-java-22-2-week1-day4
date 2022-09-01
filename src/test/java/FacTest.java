import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacTest {
    @Test
    void fac3 (){
        int i = 3;
        int actual = Fac.fac(i);
        assertEquals(6, actual);
    }

    @Test
    void fac4 (){
        int i = 4;
        int actual = Fac.fac(i);
        assertEquals(24, actual);
    }

    @Test
    void fac12 (){
        int i = 12;
        int actual = Fac.fac(i);
        assertEquals(479001600, actual);
    }

    @Test
    void fac0 (){
        int i = 0;
        int actual = Fac.fac(i);
        assertEquals(1, actual);
    }

    @Test
    void facAll (){
        int[] nbr = {1,1,2,6,24,120,720};
        for (int i = 0; i <= (nbr.length - 1) ; i++){
            int actual = Fac.fac(i);
            assertEquals(nbr[i], actual);
        }
    }

    @Test
    void fac2All (){
        int[] nbr = {1,1,2,6,24,120,720};
        for (int i = 0; i <= (nbr.length - 1) ; i++){
            int actual = Fac.fac2(i);
            assertEquals(nbr[i], actual);
        }
    }
    @Test
    void fac3All (){
        int[] nbr = {1,1,2,6,24,120,720};
        for (int i = 0; i <= (nbr.length - 1) ; i++){
            int actual = Fac.fac3(i);
            assertEquals(nbr[i], actual);
        }
    }
}
