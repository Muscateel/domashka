package lab5;
public class Person {
    private String fullName;
    private int age;

    // Конструктор по умолчанию
    public Person() {
        // В этом конструкторе не инициализируем поля
    }

    // Конструктор с параметрами
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // Метод для движения
    public void move() {
        System.out.println(fullName + " двигается");
    }

    // Метод для разговора
    public void talk() {
        System.out.println(fullName + " говорит");
    }

    public static void main(String[] args) {
        // Создаем объекты класса Person с использованием разных конструкторов
        Person person1 = new Person(); // Используем конструктор по умолчанию
        person1.fullName = "Иванов Иван";
        person1.age = 30;

        Person person2 = new Person("Петров Петр", 25); // Используем конструктор с параметрами

        // Вызываем методы для каждого объекта
        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }
}
