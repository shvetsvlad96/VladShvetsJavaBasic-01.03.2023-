package HomeworkThirteen;

public class Burger {
    public String bun;
    public String meat;
    public String cheese;
    public String veggies;
    public String mayo;
    public String extraMeat;

    public Burger(String bun, String meat, String cheese, String veggies, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.veggies = veggies;
        this.mayo = mayo;
        System.out.println("Ингредиенты на обычный бургер: " + bun + ", " + meat + ", " + cheese + ", " + veggies + ", " + mayo);
    }

    public Burger(String bun, String meat, String cheese, String veggies) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.veggies = veggies;
        System.out.println("Ингредиенты на диетический бургер: " + bun + ", " + meat + ", " + cheese + ", " + veggies);
    }

    public Burger(String bun, String meat, String cheese, String veggies, String mayo, String extraMeat) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.veggies = veggies;
        this.mayo = mayo;
        this.extraMeat = extraMeat;
        System.out.println("Ингредиенты на бургер с двойным мясом: " + bun + ", " + meat + ", " + cheese + ", " + veggies + ", " + mayo + ", " + extraMeat);
    }
    public class BurgerMain {
        public static void main(String[] args) {
            Burger regularBurger = new Burger("Булочка", "мясная котлета", "сыр", "лук, капуста", "майонез");
            Burger dietBurger = new Burger("Булочка", "мясная котлета", "сыр", "лук, капуста");
            Burger doubleMeatBurger = new Burger("Булочка", "мясная котлета", "сыр", "лук, капуста", "майонез", "дополнительная котлета");
        }
    }
}

