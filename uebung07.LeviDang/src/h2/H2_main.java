package h2;

import java.util.Arrays;

public class H2_main {

    public static int[] change(int[] a, int[] b, int start, int end) {

        if (end > start && Arrays.compare(a, b) != 0) {
            return Arrays.copyOf(a, a.length);
        } 
        else if (end > start && Arrays.compare(a, b) == 0) {
            Arrays.sort(a);
            return Arrays.copyOfRange(a, start, end);
        } 
        else {
            return new int[0];
        }
    }

    public static void main(String[] args) {
        int[] a1 = {2, 7, 1, 9};
        int[] b1 = {5, 6, 7};
        System.out.println(Arrays.toString(change(a1, b1, 2, 4)));

        int[] a2 = {2, 7, 1, 9};
        int[] b2 = {2, 7, 1, 9};
        System.out.println(Arrays.toString(change(a2, b2, 2, 4)));

        int[] a3 = {2, 7, 1, 9};
        int[] b3 = {2, 7, 1, 9};
        System.out.println(Arrays.toString(change(a3, b3, 3, 2)));
    }
}
