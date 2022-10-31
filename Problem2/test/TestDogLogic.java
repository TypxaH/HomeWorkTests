import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDogLogic {
    @Test
    public void testMakeSound() {
        Dog dog = new Dog("Bolonka","Shugar",5,2.5);
        String actualSound = dog.makeSound();
        String expectedSound = "Bau Bau!";
        assertEquals(expectedSound,actualSound);
    }
    @Test
    public void testEat1() {
        Dog dog = new Dog("Bolonka","Shugar",5,2.5);
        dog.eat("food");
        double actualWeight = dog.getWeightKg();
        double expectedWeight = 2.55;
        assertEquals(expectedWeight,actualWeight);
    }
    @Test
    public void testEat2() {
        Dog dog = new Dog("Bolonka","Shugar",5,10);
        dog.eat("food");
        double actualWeight = dog.getWeightKg();
        double expectedWeight = 10.05;
        assertEquals(expectedWeight,actualWeight);
    }
    @Test
    public void testWalkOut1() {
        Dog dog = new Dog("Bulonka","Shugar",5,2.5);
        dog.walkOut(10);
        double actualWeight = dog.getWeightKg();
        double expectedWeight = 2.46;
        assertEquals(expectedWeight,actualWeight);
    }
    @Test
    public void testWalkOut2() {
        Dog dog = new Dog("Bulonka","Shugar",5,10);
        dog.walkOut(10);
        double actualWeight = dog.getWeightKg();
        double expectedWeight = 9.96;
        assertEquals(expectedWeight,actualWeight);
    }
}
