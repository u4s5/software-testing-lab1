package math;

public class Functions {

    private final static double EPS = 1e-2;
    private final static double resultFor1 = 1.57;

    public static double arcsin(double x) {

        if (x < -1 || x > 1)
            return Double.NaN;
        if (x == 1 || x == -1)
            return x * resultFor1;

        double result = 0;
        int n = 1;
        double prev;

        do {
            prev = result;
            result += fact(2 * n) / (Math.pow(4, n) * Math.pow(fact(n), 2) * (2 * n + 1))
                    * Math.pow(x, 2 * n + 1);
            n++;
        } while ((Math.abs(result - prev)) > EPS / 100);

        return Math.round((result + x) * (1 / EPS)) / (1 / EPS);

    }

    private static double fact(int n) {
        double res = 1.0;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
