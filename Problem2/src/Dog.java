//Да се направи клас Dog с полета: порода, име,
//възраст, тегло. И методи: makeSound() - който отпечатва
//“Bau Bau!”, eat(String food), който увеличава теглото на
//кучето с 50гр, и walkOut(int time), при който теглото на
//кучето намаля с 40гр.
//Добавете поне по 2 тестови сценария към методите
//eat(), walkOut() и тествайте метода makeSound().
public class Dog {
    private String breed;
    private String name;
    private int age;
    private double weightKg;

    public Dog(String breed, String name, int age, double weightKg) {
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.weightKg = weightKg;
    }

    public double getWeightKg() {
        return this.weightKg;
    }

    public void setWeightKg(double weight) {
        this.weightKg = weight;
    }

    public String makeSound() {
        return "Bau Bau!";
    }

    public void eat(String food) {
        this.weightKg += 0.05;
    }

    public void walkOut(int time) {
        this.weightKg -= 0.04;
    }
}
