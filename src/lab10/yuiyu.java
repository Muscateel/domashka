package lab10;

import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Studentt {
    private String name, surname, spec;
    private int kurs, group;

    public Studentt(String name, String surname, String spec, int kurs, int group) {
        this.surname = surname;
        this.name = name;
        this.kurs = kurs;
        this.spec = spec;
        this.group = group;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public int getKurs() {
        return kurs;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Studentt{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", spec='" + spec + '\'' +
                ", kurs=" + kurs +
                ", group=" + group +
                '}';
    }
}

class test {

    private List<Studentt> studenttList;

    public test(List<Studentt> studenttList) {
        this.studenttList = studenttList;
    }

    public void setStudenttList(List<Studentt> studenttList) {
        this.studenttList = studenttList;
    }

    public void outStudenttList() {
        for (Studentt student : studenttList) {
            System.out.println(student);
        }
    }

    public void sortByField(Comparator<Studentt> comparator) {
        Collections.sort(studenttList, comparator);
    }

    public void quicksort(Comparator<Studentt> comparator) {
        Collections.sort(studenttList, comparator);
    }

    public static void main(String[] args) {

        List<Studentt> list1 = new ArrayList<>();
        list1.add(new Studentt("vova", "bobkin", "kok", 2, 3));
        list1.add(new Studentt("vovaaa", "bob", "k", 2, 5));
        list1.add(new Studentt("vovasdad", "b", "ko", 2, 63));

        List<Studentt> list2 = new ArrayList<>();
        list1.add(new Studentt("v", "bobkinjj", "kofgk", 1, 2));
        list1.add(new Studentt("vr", "bobjjj", "kjj", 1, 2));
        list1.add(new Studentt("vb", "bjjj", "koh", 1, 4));

        test sorter = new test(list1);

        System.out.println("Студенты до сортировки по GPA:");
        sorter.outStudenttList();

        sorter.quicksort(Comparator.comparing(Studentt::getKurs).reversed());

        sorter.outStudenttList();

        sorter.setStudenttList(list2);

        sorter.outStudenttList();

        sorter.sortByField(Comparator.comparing(Studentt::getName));

        sorter.outStudenttList();
    }


}