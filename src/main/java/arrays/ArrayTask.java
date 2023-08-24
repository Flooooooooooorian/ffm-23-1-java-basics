package arrays;

import java.util.Arrays;

public class ArrayTask {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Schritt 1: Array ausgeben
        System.out.println(Arrays.toString(numbers));

        // Schritt 2: Summe berechnen
        int sum = calculateSum(numbers);
        System.out.println(sum);

        // Schritt 3: Größte Zahl finden
        int max = findMax(numbers);
        System.out.println("Größte Zahl: " + max);

        // Schritt 4: Zweites Array erstellen
        int[] array2 = new int[10];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 11;
        }

        // Schritt 5: Arrays elementweise addieren
        int[] resultArray = addArrays(numbers, array2);
        System.out.println(Arrays.toString(resultArray));
    }

    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        return sum;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] addArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] + arr2[i];
        }
        return result;
    }
}
