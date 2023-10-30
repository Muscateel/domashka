package lab8;

public class xcvb {
   private int chis1;
   private int chis2;

    public xcvb(int chis1, int chis2) {
        this.chis1 = chis1;
        this.chis2 = chis2;
    }

    public int getChis1() {
        return chis1;
    }

    public int getChis2() {
        return chis2;
    }
}

class TESTER {

    public static void main(String[] args) {
        xcvb test1 = new xcvb(20, 2);
        xcvb test2 = new xcvb(2, 40);
        int A = test1.getChis1();
        int B = test1.getChis2();
        if (A < B) {
            for (int i = A; i <= B; i++) {
                System.out.println(i + " ");
            }
        } else {
            for (int i = A; i >= B; i--) {
                System.out.print(i + " ");
            }
        }
        System.out.println("Другой массив");
        int A1 = test2.getChis1();
        int B1 = test2.getChis2();
        if (A1 < B1) {
            for (int i = A; i <= B1; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = A1; i >= B1; i--) {
                System.out.print(i + " ");
            }
        }

    }

}