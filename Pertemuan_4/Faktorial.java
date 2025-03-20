package Pertemuan_4;

public class Faktorial {
    int FactorialBF (int n) {
        int Facto = 1;
        for (int i = 1; i <= n; i++) {
            Facto = Facto * i;
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
