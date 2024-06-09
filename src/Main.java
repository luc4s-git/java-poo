import Thing.Dog;
import Thing.FremenNPC;
import Thing.Muadib;

public class Main {
    public static void main(String[] args) {
//        String[] arg = {"Greetings", "World"};
//        greetings(arg);

//        Dog dog_1 = new Dog("Black", 100, 10.54, 20);
//        System.out.println(dog_1.getIndex());
//        Dog dog_2 = new Dog("White", 100, 10.5, 18);
//        System.out.println(dog_2.getIndex());
//
//        dog_1.setName("Rookie");
//        dog_2.setName("Cookie");

//        System.out.println(dog_1.toString());
//        System.out.println(dog_2.toString());
////        dog_2 = dog_1;
//        System.out.println("-------------");
//        System.out.println(dog_1.toString());
//        System.out.println(dog_2.toString());

        FremenNPC randomFremen_1 = new FremenNPC("Chani", 170, 60, "Joyful");
        FremenNPC randomFremen_2 = new FremenNPC("Stilgar", 180, 85, "Hopeful");
        Muadib lisanAlGaib = new Muadib("Mahdi", 180, 70, "Vengeful");

        randomFremen_1.say();
        randomFremen_2.say();
        lisanAlGaib.say();
    }

    public static void greetings(String[] who) {
//        System.out.println(who[0] + ", " + who[1] + "!");
    }
}