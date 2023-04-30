package HomeworkTwelvePersonInfo;

public class Person {
    public Person(String name, String surname, String city, String phone) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.phone = phone;
    }

    public String personInfo() {
        return "Зателефонувати громадянину " + name +" " + surname + " із міста " + city + " можна за номером " + phone;
    }

    public String name;
    public String surname;
    public String city;
    public String phone;

        public static void main(String[] args) {
            Person personOne = new Person("Will", "Smith", "New York", "2936729462846");
            Person personTwo = new Person("Jackie", "Chan", "Shanghai", "12312412412");
            Person personThree = new Person("Sherlock", "Holmes", "London", "37742123513");
            System.out.println(personOne.personInfo());
            System.out.println(personTwo.personInfo());
            System.out.println(personThree.personInfo());
        }
    }
