package lab3;

public class Jaja {
    public static void main(String[] args) {


    Double doubleObj = 3.148888;

    // Преобразование к примитивным типам
    double doubleValue = doubleObj.doubleValue();
    int intValue = doubleObj.intValue();
    float floatValue = doubleObj.floatValue();
    long longValue = doubleObj.longValue();

// Вывод преобразованных значений
System.out.println("doubleValue: " + doubleValue);
System.out.println("intValue: " + intValue);
System.out.println("floatValue: " + floatValue);
System.out.println("longValue: " + longValue);

}}
