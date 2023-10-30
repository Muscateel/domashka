package lab11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {

        LocalDateTime currentDateTime = LocalDateTime.now();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату и время (в формате dd.MM.yyyy HH:mm:ss): ");
        String userInput = scanner.nextLine();

        try {

            LocalDateTime userDateTime = LocalDateTime.parse(userInput, formatter);


            if (currentDateTime.isBefore(userDateTime)) {
                System.out.println("Текущая дата и время раньше введенных данных.");
            } else if (currentDateTime.isAfter(userDateTime)) {
                System.out.println("Текущая дата и время позже введенных данных.");
            } else {
                System.out.println("Текущая дата и время совпадают с введенными данными.");
            }
        } catch (java.time.format.DateTimeParseException e) {
            System.out.println("Ошибка при парсинге даты и времени. Убедитесь, что формат ввода соответствует dd.MM.yyyy HH:mm:ss.");
        }
    }
}
