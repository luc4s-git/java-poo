import Animals.Dog;

public class Main {
    public static void main(String[] args) {
//        String[] arg = {"Greetings", "World"};
//        greetings(arg);

        Dog dog_1 = new Dog("Black", 100, 10.54, 20);

        dog_1.setName("Cookie");

        dog_1.bark();

        dog_1.action("talk");
        dog_1.action("kick");
    }

    public static void greetings(String[] who) {
//        System.out.println(who[0] + ", " + who[1] + "!");
    }
}