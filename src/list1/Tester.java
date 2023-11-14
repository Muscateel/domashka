package list1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        ListContainer list = new ListContainer();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Создать пустой список");
            System.out.println("2. Добавить элемент");
            System.out.println("3. Удалить элемент");
            System.out.println("4. Вывести список");
            System.out.println("5. Очистить список");
            System.out.println("6. Проверить на пустоту");
            System.out.println("7. Выйти");

            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    list = new ListContainer();
                    break;
                case 2:
                    scanner.nextLine();  // Очищаем буфер
                    System.out.print("Введите данные для добавления: ");
                    String data = scanner.nextLine();
                    list.addItem(data);
                    break;
                case 3:
                    System.out.print("Введите индекс элемента для удаления: ");
                    int index = scanner.nextInt();
                    list.removeItem(index);
                    break;
                case 4:
                    System.out.println("Список:");
                    list.displayItems();
                    break;
                case 5:
                    list.clear();
                    System.out.println("Список очищен.");
                    break;
                case 6:
                    if (list.isEmpty()) {
                        System.out.println("Список пуст.");
                    } else {
                        System.out.println("Список не пуст.");
                    }
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неправильный выбор. Попробуйте снова.");
            }
        }
    }
}