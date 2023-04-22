package HomeworkTenLottery;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.nio.file.Files.size;
import static java.util.Arrays.sort;

public class Lottery {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] arrayOne = new int[7];
        for (int i = 0; i < 7; i++) {
            arrayOne[i] = random.nextInt(10);
        }
        System.out.println("Числа, які загадала фірма-організатор: " + Arrays.toString(arrayOne));
        int[] arrayTwo = new int[7];
        for (int i = 0; i < 7; i++) {
            arrayTwo[i] = scanner.nextInt();
        }
        System.out.println("Числа, які загадав гравець: " + Arrays.toString(arrayTwo));
        for (int i = 0; i < arrayOne.length - 1; i++) {
            for (int j = 0; j < arrayOne.length - i - 1; j++) {
                if (arrayOne[j] > arrayOne[j + 1]) {
                    int temp = arrayOne[j];
                    arrayOne[j] = arrayOne[j + 1];
                    arrayOne[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arrayOne));

        for (int i = 0; i < arrayTwo.length - 1; i++) {
            for (int j = 0; j < arrayTwo.length - i - 1; j++) {
                if (arrayTwo[j] > arrayTwo[j + 1]) {
                    int temp = arrayTwo[j];
                    arrayTwo[j] = arrayTwo[j + 1];
                    arrayTwo[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arrayTwo));

        boolean equals = true;
        for (int i = 0; i < 7; i++) {
            int one = arrayOne[i];
            int two = arrayTwo[i];
            if (one != two) {
                equals = false;
                break;
            }
        }
        if (equals) {
            System.out.println("Массивы равны");
        } else {
            System.out.println("Массивы не равны");
        }
    }
}
