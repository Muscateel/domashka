package lab2;

import java.util.ArrayList;
import java.util.Scanner;

// Класс, представляющий компьютер
class Computer {
    private String brand;
    private String model;
    private double price;

    public Computer(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Computer [brand=" + brand + ", model=" + model + ", price=" + price + "]";
    }
}

// Интерфейс для ввода информации о компьютерах с клавиатуры
interface ComputerInput {
    Computer inputComputer();
}

// Класс магазина
class Shop {
    private ArrayList<Computer> computers;

    public Shop() {
        computers = new ArrayList<>();
    }

    // Метод для добавления компьютера в магазин
    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    // Метод для удаления компьютера из магазина
    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    // Метод для поиска компьютера в магазине по бренду и модели
    public Computer findComputer(String brand, String model) {
        for (Computer computer : computers) {
            if (computer.getBrand().equalsIgnoreCase(brand) && computer.getModel().equalsIgnoreCase(model)) {
                return computer;
            }
        }
        return null; // Компьютер не найден
    }

    // Метод для вывода всех компьютеров в магазине
    public void printComputers() {
        for (Computer computer : computers) {
            System.out.println(computer.toString());
        }
    }
}

class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();

        // Ввод информации о компьютерах с клавиатуры
        System.out.println("Введите информацию о компьютерах (бренд, модель, цена):");
        while (true) {
            System.out.print("Бренд (или 'конец' для завершения): ");
            String brand = scanner.nextLine();
            if (brand.equalsIgnoreCase("конец")) {
                break;
            }

            System.out.print("Модель: ");
            String model = scanner.nextLine();

            System.out.print("Цена: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Очистка буфера после считывания числа

            Computer computer = new Computer(brand, model, price);
            shop.addComputer(computer);
        }

        // Вывод информации о компьютерах в магазине
        System.out.println("Список компьютеров в магазине:");
        shop.printComputers();

        // Поиск компьютера
        System.out.print("Введите бренд компьютера для поиска: ");
        String searchBrand = scanner.nextLine();
        System.out.print("Введите модель компьютера для поиска: ");
        String searchModel = scanner.nextLine();

        Computer foundComputer = shop.findComputer(searchBrand, searchModel);
        if (foundComputer != null) {
            System.out.println("Найден компьютер: " + foundComputer.toString());
        } else {
            System.out.println("Компьютер не найден.");
        }
    }
}
