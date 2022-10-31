import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first seconds: ");
        int sec1 = sc.nextInt();
        System.out.print("Enter the second seconds: ");
        int sec2 = sc.nextInt();
        System.out.println("Total time is: "+getTotalTime(sec1,sec2));
    }
//�� �� ������ �����, ����� �� �������� 2 ���� ����� - ���� �������
//����� ���� �������� String ��� ������ �������:�������.
    public static String getTotalTime(int firstSec, int secondSec) {
        int sum = firstSec + secondSec;
        int minutes = sum/60;
        int seconds = sum % 60;
        return minutes+":"+seconds;
    }
}