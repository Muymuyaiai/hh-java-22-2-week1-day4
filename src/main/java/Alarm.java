public class Alarm {
    public static String alarm(String alarmColor,int i){
        int color = -2;

        switch (alarmColor) {
            case "rot":
                color = -1;
                break;
            case "gelb":
                color = 30;
                break;
            case "grün":
                color = 60;
                break;
        }

        if(i <= color && i >= 0){
            return "Maximale Personenzahl nicht überschritten";
        } else if (i > color && i >= 0) {
            return "Zu viele Personen zurück";
        }
        return "Invalid parameter";
    }
}
