import Animals.Dog;

public class Main {
    public static void main(String[] args) {
//        String[] arg = {"Greetings", "World"};
//        greetings(arg);

        Dog dog_1 = new Dog();

        dog_1.name = "Cookie";
        dog_1.color = "Black";
        dog_1.height = 100;
        dog_1.weight = 1140.50;
        dog_1.tailSize = 20;

        System.out.println(dog_1.weight);
    }

    public static void greetings(String[] who) {
//        System.out.println(who[0] + ", " + who[1] + "!");
    }
}