public class LagrangeMethod {
    public static double interpolation(int m, double[] x, double[] y, double z) {
        double result = 0;
        double c, d;
        for (int i = 0; i < m; i++) {
            c = 1;
            d = 1;
            for (int j = 0; j < m; j++) {
                if (i != j) {
                    c *= (z - x[j]);
                    d *= (x[i] - x[j]);
                }
            }
            result += (y[i] * (c / d));
        }
        return result;
    }
}
