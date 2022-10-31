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
//Да се напише метод, който по подадени 2 цели числа - брой секунди
//връща като резултат String във формат ‘минути:секунди‘.
    public static String getTotalTime(int firstSec, int secondSec) {
        int sum = firstSec + secondSec;
        int minutes = sum/60;
        int seconds = sum % 60;
        return minutes+":"+seconds;
    }
}