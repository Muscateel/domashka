package lab3;

import java.util.Arrays;
import java.util.Random;
public class main {
    public static void main(String[] args) {


        int n = 10;
       double[] array1 = new double[n];
        double[] array2 = new double[n];

        for (int i = 0; i < n; i++) {
            array1[i] = Math.random()*10;
        }
        for (double num : array1) {
            System.out.println(num);
        }

        Arrays.sort(array1);

        System.out.println("Отсортирован");

        for (double num : array1) {
            System.out.println(num);
        }

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            array2[i] = random.nextDouble()*10;
        }
        for (double num : array2) {
            System.out.println(num);
        }

        Arrays.sort(array2);

        System.out.println("Отсортирован");

        for (double num : array2) {
            System.out.println(num);
        }
    }
}