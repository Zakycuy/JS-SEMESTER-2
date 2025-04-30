package Pertemuan_4;

public class Faktorial {
    int FactorialBF (int n) {
        int Facto = 1;
        int i = 1;
        while (i <= n) {
        Facto = Facto * i;
        i++;
        }
    return Facto;
}
    
    int FactorialDC (int n) {
        if (n == 1) {
            return 1;
        } else {
            int Facto = n * FactorialDC(n - 1);
            return Facto;
        }
    }
}
