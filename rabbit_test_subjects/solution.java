package com.google.challenges;

public class Answer {
    public static int answer(double[] y, double[] x) {
        double ysum = sum(y);
        double xsum = sum(x);

        if (xsum > ysum) {
            return cal(xsum, ysum);
        } else if (xsum < ysum) {
            return cal(ysum, xsum);
        } else {
            return 0;
        }
    }

    private static int cal(double before, double after) {
        return (int) ((before - after) * 100 / before);
    }

    private static double sum(double[] numbers) {
        double r = 0;
        for (int i = 0; i < numbers.length; i++) {
            r += numbers[i];
        }
        return r;
    }
}
