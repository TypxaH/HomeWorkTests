//�� �� ������� ���� Dog � ������: ������, ���,
//�������, �����. � ������: makeSound() - ����� ���������
//�Bau Bau!�, eat(String food), ����� ��������� ������� ��
//������ � 50��, � walkOut(int time), ��� ����� ������� ��
//������ ������ � 40��.
//�������� ���� �� 2 ������� �������� ��� ��������
//eat(), walkOut() � ��������� ������ makeSound().
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
