package HomeworkThirteen;

public class BurgerMain {
    public static void main(String[] args) {
        Burger regularBurger = new Burger("Булочка", "мясная котлета", "сыр", "лук, капуста", "майонез");
        Burger dietBurger = new Burger("Булочка", "мясная котлета", "сыр", "лук, капуста");
        Burger doubleMeatBurger = new Burger("Булочка", "мясная котлета", "сыр", "лук, капуста", "майонез", "дополнительная котлета");
    }
}