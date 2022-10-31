import java.util.Scanner;
//���� �������� ���� ����� ������� � ���� ��� ��������. ���������
//"fruit" �� banana, apple, kiwi, cherry, lemon � grapes. �����������
//"vegetable" �� tomato, cucumber, pepper � carrot. ������ �������� ��
//"unknown".
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a product: ");
        String product = sc.nextLine();
        System.out.println(getTypeOfProduct(product));
    }

    static String getTypeOfProduct(String nameOfProduct) {
        return switch (nameOfProduct) {
            case "banana", "apple", "kiwi", "cherry", "lemon", "grapes" -> "fruit";
            case "tomato", "cucumber", "pepper", "carrot" -> "vegetable";
            default -> "unknown";
        };
    }
}