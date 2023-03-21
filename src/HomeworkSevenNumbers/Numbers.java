package HomeworkSevenNumbers;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        int computer = (int) (Math.random() * 11);
        System.out.println("It is Number - ");
        int i = 0;
        for (i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            int humanNumber = scanner.nextInt();
            if (humanNumber == computer) {
                System.out.println("Human was right");
                return;
            } else if (i == 2) {
                System.out.println("Human was wrong");
            } else {
                System.out.println("Next try");
            }
        }
    }
}
