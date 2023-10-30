package lab8;

public class asd {
    public static void main(String[] args) {
        int N = 1998;

        int sum = calculateSumOfDigits(N);
        System.out.println("Сумма цифр числа " + N + " равна " + sum);
    }


    public static int calculateSumOfDigits(int num) {
        if (num < 10) {
            return num;
        } else {
            int lastDigit = num % 10;
            int remainingDigits = num / 10;
            int sumOfRemainingDigits = calculateSumOfDigits(remainingDigits);
            return lastDigit + sumOfRemainingDigits;
        }
    }
}
