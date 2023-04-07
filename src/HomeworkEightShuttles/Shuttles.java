package HomeworkEightShuttles;

public class Shuttles {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; count < 100; i++) {
            if (i % 10 == 4 || i % 10 == 9 || (i % 100) / 10 == 4 || (i % 100) / 10 == 9) {
                continue;
            }
            count++;
            System.out.println("Shuttle " + count + " = " + i);
        }
    }
}