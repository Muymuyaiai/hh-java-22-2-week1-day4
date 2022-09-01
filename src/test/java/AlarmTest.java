import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlarmTest {

    @Test
    void isGreaterRot30 (){
        String color = "rot" ;
        int i = 30;
        String actual = Alarm.alarm(color,i);
        assertEquals("Zu viele Personen zurück", actual);
    }

    @Test
    void isGreaterRot0 (){
        String color = "rot" ;
        int i = 0;
        String actual = Alarm.alarm(color,i);
        assertEquals("Zu viele Personen zurück", actual);
    }

    @Test
    void isGreaterRotNegative (){
        String color = "rot" ;
        int i = -35;
        String actual = Alarm.alarm(color,i);
        assertEquals("Invalid parameter", actual);
    }
    @Test
    void isGreaterGelb3 (){
        String color = "gelb" ;
        int i = 3;
        String actual = Alarm.alarm(color,i);
        assertEquals("Maximale Personenzahl nicht überschritten", actual);
    }
    @Test
    void isGreaterGelb31 (){
        String color = "gelb" ;
        int i = 31;
        String actual = Alarm.alarm(color,i);
        assertEquals("Zu viele Personen zurück", actual);
    }
    @Test
    void isGreaterGelbNegativ (){
        String color = "gelb" ;
        int i = -12;
        String actual = Alarm.alarm(color,i);
        assertEquals("Invalid parameter", actual);
    }

    @Test
    void isGreaterGruen99 () {
        String color = "grün";
        int i = 99;
        String actual = Alarm.alarm(color, i);
        assertEquals("Zu viele Personen zurück", actual);
    }

    @Test
    void isGreaterGruen56 () {
        String color = "grün";
        int i = 56;
        String actual = Alarm.alarm(color, i);
        assertEquals("Maximale Personenzahl nicht überschritten", actual);
    }
}
