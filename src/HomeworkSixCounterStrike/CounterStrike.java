package HomeworkSixCounterStrike;

public class CounterStrike {
    public static void main(String[] args) {
        String firstTeam = "teamNavi";
        System.out.println(firstTeam);
        int firstNaviPlayer = 1;
        int secondNaviPlayer = 2;
        int thirdNaviPlayer = 3;
        int fourthNaviPlayer = 4;
        int fifthNaviPlayer = 5;
        int average = (firstNaviPlayer + secondNaviPlayer + thirdNaviPlayer + fourthNaviPlayer + fifthNaviPlayer) / 5;
        System.out.println("Average : " + average);

        String secondTeam = "teamVirtusPro";
        System.out.println(secondTeam);
        int firstVirtusProPlayer = 6;
        int secondVirtusProPlayer = 5;
        int thirdVirtusProPlayer = 4;
        int fourthVirtusProPlayer = 3;
        int fifthVirtusProPlayer = 2;
        int averageVirtusPro = (firstVirtusProPlayer + secondVirtusProPlayer + thirdVirtusProPlayer + fourthVirtusProPlayer + fifthVirtusProPlayer) / 5;
        System.out.println("Average : " + averageVirtusPro);
        if (average < averageVirtusPro) {
            System.out.println("Перемогла команда " + secondTeam + " набрала " + averageVirtusPro + " очків");
        }
    }
}