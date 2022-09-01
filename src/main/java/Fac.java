public class Fac {
    public static int fac(int nbr){
        int prod = 1;
        for (int i = 1; i <= nbr; ++i) {
            prod = prod * i;
        }
        return prod;
    }
}
