import java.util.Scanner;

//Да се напише програма, която въвежда n цели числа и изчислява сумата им.
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.println(sumOf_N_Numbers(n));
    }

    static int sumOf_N_Numbers(int num) {
        int sum = 0;
        for (int i = 0; i < num; i++) {
            int currentNumber = Integer.parseInt(sc.nextLine());
            sum += currentNumber;
        }
        return sum;
    }
}
