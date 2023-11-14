package list1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class CardItem {
    private String name;
    private int age;

    public void readAttributes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        name = scanner.nextLine();
        System.out.print("Введите возраст: ");
        age = scanner.nextInt();
    }

    public void displayAttributes() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}

public class CardCatalog {
    public static void main(String[] args) {


            ListContainer list = new ListContainer();

            list.addItem("Элемент 1");
            list.addItem("Элемент 2");
            list.addItem("Элемент 3");

            System.out.println("Список:");
            list.displayItems();

            if (!list.isEmpty()) {
                list.removeItem(1);
                System.out.println("После удаления элемента:");
                list.displayItems();
            }

            list.clear();
            System.out.println("Список после очистки:");
            list.displayItems();

        CardItem card = new CardItem();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Ввести атрибуты");
            System.out.println("2. Вывести атрибуты");
            System.out.println("3. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    card.readAttributes();
                    break;
                case 2:
                    card.displayAttributes();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Неправильный выбор. Попробуйте снова.");
            }
        }
    }
}


class ListItem {
    private String data;

    public ListItem(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}

class ListContainer {
    private List<ListItem> items;

    public ListContainer() {
        items = new ArrayList<>();
    }

    public void addItem(String data) {
        ListItem newItem = new ListItem(data);
        items.add(newItem);
    }

    public void removeItem(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
        } else {
            System.out.println("Недопустимый индекс.");
        }
    }

    public void displayItems() {
        for (ListItem item : items) {
            System.out.println(item.getData());
        }
    }

    public void clear() {
        items.clear();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}

