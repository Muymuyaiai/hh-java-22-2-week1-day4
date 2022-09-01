import org.junit.jupiter.api.Test;

public class AlarmTest {
    @Test
    void isGreater30_3 (){
        int i = 3;
        String actual = Alarm.alarm(i);
        assertEqual("Maximale Personenuahl nicht überschritten" == actual);
    }
}
