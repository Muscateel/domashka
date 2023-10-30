package lab11;

import java.util.Date;
import java.text.SimpleDateFormat;

public class TaskInfo {
    public static void main(String[] args) {

        String developerName = "Иванов";


        Date taskReceivedDate = new Date();

        Date taskSubmissionDate = new Date(taskReceivedDate.getTime() + 7 * 24 * 60 * 60 * 1000); // Добавляем 7 дней


        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        System.out.println("Фамилия разработчика: " + developerName);
        System.out.println("Дата и время получения задания: " + dateFormat.format(taskReceivedDate));
        System.out.println("Дата и время сдачи задания: " + dateFormat.format(taskSubmissionDate));
    }
}