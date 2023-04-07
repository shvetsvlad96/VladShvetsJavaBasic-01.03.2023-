package HomeworkNineRegbi;

import java.util.Random;
import java.util.Arrays;

public class Regbi {
    public static void main(String[] args) {
        Random random = new Random();
        int[] teamOne = new int[25];
        int[] teamTwo = new int[25];
        for (int i = 0; i < 25; i++) {
            teamOne[i] = random.nextInt(18) + 22;
            teamTwo[i] = random.nextInt(18) + 22;
        }
        System.out.println("Humans age of teamOne: " + Arrays.toString(teamOne));
        System.out.println("Humans age of teamTwo: " + Arrays.toString(teamTwo));

        double averageTeamOne = Arrays.stream(teamOne).average().orElse(0);
        double averageTeamTwo = Arrays.stream(teamTwo).average().orElse(0);

        System.out.println("Humans average of teamOne: " + averageTeamOne);
        System.out.println("Humans average of teamTwo: " + averageTeamTwo);
        }
    }
