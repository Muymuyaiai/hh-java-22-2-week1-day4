public class Fac {
    public static int fac(int nbr){
        int prod = 1;
        for (int i = 1; i <= nbr; ++i) {
            prod *= i;
        }
        return prod;
    }

    public static int fac2(int nbr){
        int i = 1;
        int prod = 1;
        while (i <= nbr){
            prod *= i;
            ++i;
        }
        return prod;
    }
}
