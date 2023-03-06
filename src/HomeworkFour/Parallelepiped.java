package HomeworkFour;

public class Parallelepiped {
    public static void main(String[] args) {
        System.out.println("----Sides of parallelepiped----");
        int length = 6;
        System.out.println("Length = " + length);
        int width = 8;
        System.out.println("Width = " + width);
        int height = 10;
        System.out.println("Height = " + height);
        int volume = length * width * height;
        System.out.println("Volume of parallelepiped = " + volume);
        int sideOne = 3;
        int sideTwo = 4;
        int sideThree = 5;
        int sideFour = 6;
        int totalLength = sideOne + sideTwo + sideThree + sideFour;
        System.out.println("Total length = " + totalLength);
    }
}
