package HomeworkFive;

public class ChinaWars {
    public static void main(String[] args) {
        System.out.println("----Dynasty Li----");
        int warriorLiAttack = 13;
        int archerLiAttack = 24;
        int horsemanLiAttack = 46;
        int warriorLi = 860;
        int archerLi = 860;
        int horsemanLi = 860;
        int totalAttackLi = (warriorLiAttack * warriorLi) + (archerLiAttack * archerLi) + (horsemanLiAttack * horsemanLi);
        System.out.println("Total Attack = " + totalAttackLi);

        System.out.println("----Dynasty Min----");
        int warriorMinAttack = 9;
        int archerMinAttack = 35;
        int horsemanMinAttack = 12;
        double warriorMin = (warriorLi * 1.5);
        double archerMin = (archerLi * 1.5);
        double horsemanMin = (horsemanLi * 1.5);
        double totalAttackMin = (warriorMinAttack * warriorMin) + (archerMinAttack * archerMin) + (horsemanMinAttack * horsemanMin);
        System.out.println("Total Attack = " + totalAttackMin);
    }
}
