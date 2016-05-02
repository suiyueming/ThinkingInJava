package exercise.arrays;

import util.CountingGenerator;

import java.util.Arrays;

/**
 * Created by suiyue on 2016/5/2 0002.
 */
public class exercise12 {
    public static void main(String[] args) {
        double[] a = new double[4];
        CountingGenerator.Double d = new CountingGenerator.Double();
        for (int i=0; i<a.length; i++) {
            a[i] = d.next();
        }
        System.out.println(Arrays.toString(a));
    }
}
