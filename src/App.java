public class App {
    public static void main(String[] args) {
        question1();
        question2();
        question3();
        problem1();
        problem2();
    }

    public static void questionIndex(int example, double valueInterp, double[] x, double[] y, int m) {
        System.out.printf("Question %d: Calculate L%d(%.3f) using the following data:\n", example, m, valueInterp);
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
        questionIndex(1, z, x, y, m - 1);
        printResult(m - 1, z, LagrangeMethod.interpolation(m, x, y, z));
    }

    public static void question2() {
        int m = 4;
        double[] x = { 1, 1.3, 1.7, 2.0 };
        double[] y = { 0.8415, 1.2526, 1.6858, 1.8186 };
        double z = 1.2;
        questionIndex(2, z, x, y, m - 1);

        printResult(m - 1, z, LagrangeMethod.interpolation(m, x, y, z));
    }

    public static void question3() {
        int m = 2;
        double[] x = { .1, .6 };
        double[] y = { 1.221, 3.32 };
        double z = .2;
        questionIndex(3, z, x, y, m - 1);
        printResult(m - 1, z, LagrangeMethod.interpolation(m, x, y, z));
    }

    public static void printResult(int m, double z, double interpolation) {
        System.out.printf("Interpolation result: L%d(%.2f) = %.4f\n\n", m, z, interpolation);
    }

    public static void problem1() {

        int m = 5;
        double[] x = { 200.0, 220.0, 240., 260., 280. };
        double[] y = { 1.075, 1.102, 1.136, 1.183, 1.250 };
        double z = 250.0;
        questionIndex(4, z, x, y, m - 1);
        printResult(m - 1, z, LagrangeMethod.interpolation(m, x, y, z));
    }

    public static void problem2() {
        int m = 7;
        double[] x = { 0, 0.5, 1.0, 1.5, 2.0, 2.5, 3.0 };
        double[] y = { 0.5, 0.69146, 0.84134, 0.93319, 0.97725, 0.99379, 0.99865 };
        double z = 0.3;
        for (int i = 1; i < m; i++) {
            questionIndex(4, z, x, y, i);
            printResult(i, z, LagrangeMethod.interpolation(i, x, y, z));
        }

    }
}
