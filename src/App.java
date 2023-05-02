public class App {
    public static void main(String[] args) {
        question1();
        question2();
        question3();
    }

    public static void questionIndex(int example, double valueInterp, double[] x, double[] y) {
        System.out.printf("Question %d: Calculate L2(%f) using the following data:\n", example, valueInterp);
        System.out.println("Abscissa:");
        printVector(x);
        System.out.println("Ordinate:");
        printVector(y);

    }

    public static void printVector(double[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (i != vector.length - 1) {
                if (i == 0) {
                    System.out.printf("[ %f, ", vector[i]);
                } else
                    System.out.printf("%f, ", vector[i]);

            } else
                System.out.printf("%f ]\n\n", vector[i]);
        }

    }

    public static void question1() {
        int m = 3;
        double[] x = { 0.1, 0.6, 0.8 };
        double[] y = { 1.221, 3.32, 4.953 };
        double z = 0.2;
        questionIndex(1, z, x, y);
        printResult(m - 1, z, LagrangeMethod.interpolation(m, x, y, z));
    }

    public static void question2() {
        int m = 4;
        double[] x = { 1, 1.3, 1.7, 2.0 };
        double[] y = { 0.8415, 1.2526, 1.6858, 1.8186 };
        double z = 1.2;
        questionIndex(2, z, x, y);

        printResult(m - 1, z, LagrangeMethod.interpolation(m, x, y, z));
    }

    public static void question3() {
        int m = 2;
        double[] x = { .1, .6 };
        double[] y = { 1.221, 3.32 };
        double z = .2;
        questionIndex(3, z, x, y);
        printResult(m - 1, z, LagrangeMethod.interpolation(m, x, y, z));
    }

    public static void printResult(int m, double z, double interpolation) {
        System.out.printf("Interpolation result: L%d(%.2f) = %.3f\n\n", m, z, interpolation);
    }
}
