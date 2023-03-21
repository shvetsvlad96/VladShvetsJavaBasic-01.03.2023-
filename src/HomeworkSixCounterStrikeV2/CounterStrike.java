package HomeworkSixCounterStrikeV2;

public class CounterStrike {
    public static void main(String[] args) {
        String firstTeam = "teamNavi";
        System.out.println(firstTeam);
        int firstNaviPlayer = (int) (Math.random() * 5);
        int secondNaviPlayer = (int) (Math.random() * 5);
        int thirdNaviPlayer = (int) (Math.random() * 5);
        int fourthNaviPlayer = (int) (Math.random() * 5);
        int fifthNaviPlayer = (int) (Math.random() * 5);
        int sumTotalFirstTeam = firstNaviPlayer + secondNaviPlayer + thirdNaviPlayer + fourthNaviPlayer + fifthNaviPlayer;
        double average = sumTotalFirstTeam / 5.0;
        System.out.println("Average : " + average);

        String secondTeam = "teamVirtusPro";
        System.out.println(secondTeam);
        int firstVirtusProPlayer = (int) (Math.random() * 5);
        int secondVirtusProPlayer = (int) (Math.random() * 5);
        int thirdVirtusProPlayer = (int) (Math.random() * 5);
        int fourthVirtusProPlayer = (int) (Math.random() * 5);
        int fifthVirtusProPlayer = (int) (Math.random() * 5);
        int sumTotalSecondTeam = firstVirtusProPlayer + secondVirtusProPlayer + thirdVirtusProPlayer + fourthVirtusProPlayer + fifthVirtusProPlayer;
        double averageVirtusPro = sumTotalSecondTeam / 5.0;
        System.out.println("Average : " + averageVirtusPro);
        if (sumTotalFirstTeam < sumTotalSecondTeam) {
            System.out.println("Перемогла команда " + secondTeam + " набрала " + sumTotalSecondTeam + " очків");
        } else if (sumTotalFirstTeam > sumTotalSecondTeam) {
            System.out.println("Перемогла команда " + firstTeam + " набрала " + sumTotalFirstTeam + " очків");
        } else {
            System.out.println("Немає переможця - нічия");
        }
    }
}