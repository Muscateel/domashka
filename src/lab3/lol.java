package lab3;
import java.util.Scanner;
public class lol {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Добро пожаловать в интернет-магазин!");
            System.out.print("Введите стоимость товара: ");
            double price = scanner.nextDouble();

            System.out.println("Выберите валюту для оплаты:");
            System.out.println("1. Доллары США");
            System.out.println("2. Евро");
            System.out.println("3. Рубли");
            int choice = scanner.nextInt();

            double exchangeRate;
            String currency;

            switch (choice) {
                case 1:
                    exchangeRate = 1.0; // Курс доллара
                    currency = "USD";
                    break;
                case 2:
                    exchangeRate = 0.85; // Курс евро
                    currency = "EUR";
                    break;
                case 3:
                    exchangeRate = 74.5; // Курс рубля
                    currency = "RUB";
                    break;
                default:
                    System.out.println("Выбрана неверная опция.");
                    return;
            }

            double totalPrice = price * exchangeRate;
            System.out.println("Стоимость товара в " + currency + ": " + totalPrice);
        }

    }

