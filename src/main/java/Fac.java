public class Fac {
    public static int fac(int n){
        int prod = 1;
        for (int i = 1; i <= n; i++) {
            prod *= i;
        }
        return prod;
    }

    public static int fac2(int n){
        int i = 1;
        int prod = 1;
        while (i <= n){
            prod *= i;
            ++i;
        }
        return prod;
    }

    public static int fac3(int n){
        if (n <= 1){
            return 1;
        } else {
            return (fac3(n-1) * n);
        }
    }
}