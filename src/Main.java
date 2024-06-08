import Animals.Dog;

public class Main {
    public static void main(String[] args) {
//        String[] arg = {"Greetings", "World"};
//        greetings(arg);

        Dog dog_1 = new Dog("Black", 100, 10.54, 20);
        System.out.println(dog_1.getIndex());
        Dog dog_2 = new Dog("White", 100, 10.5, 18);
        System.out.println(dog_2.getIndex());

        dog_1.setName("Rookie");
        dog_2.setName("Cookie");

//        System.out.println(dog_1.toString());
//        System.out.println(dog_2.toString());
////        dog_2 = dog_1;
//        System.out.println("-------------");
//        System.out.println(dog_1.toString());
//        System.out.println(dog_2.toString());


    }

    public static void greetings(String[] who) {
//        System.out.println(who[0] + ", " + who[1] + "!");
    }
}