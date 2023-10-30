package lab9;

import java.util.Arrays;
import java.util.Comparator;

class Student {
    private int iDNumber;
    private String name;

    public Student(int iDNumber, String name) {
        this.iDNumber = iDNumber;
        this.name = name;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student [iDNumber=" + iDNumber + ", name=" + name + "]";
    }
}

public class StudentSortTest {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student(102, "Alice");
        students[1] = new Student(101, "Bob");
        students[2] = new Student(105, "Charlie");
        students[3] = new Student(103, "David");
        students[4] = new Student(104, "Eva");
        System.out.println("Массив до сортировки:");
        for (Student student : students) {
            System.out.println(student);
        }
        insertionSort(students);

        System.out.println("\nМассив после сортировки:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void insertionSort(Student[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            Student name = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].getIDNumber() > name.getIDNumber()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = name;
        }
    }
}