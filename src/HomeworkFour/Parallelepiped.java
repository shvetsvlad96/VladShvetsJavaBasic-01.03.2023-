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
        int totalLength = 4 * (length + width + height); // Сумма всех сторон, при условии что параллелипипед прямоугольный.
        System.out.println("Total length = " + totalLength);
    }
}
