import java.util.Scanner;
//Нека проверим дали даден продукт е плод или зеленчук. Плодовете
//"fruit" са banana, apple, kiwi, cherry, lemon и grapes. Зеленчуците
//"vegetable" са tomato, cucumber, pepper и carrot. Всички останали са
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