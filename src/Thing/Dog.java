package Thing;

public class Dog {
    static int dogIndex; // sets a value at the class rather than the object, meaning any object build from this class will share the value
    private String name = "Dog Meat";
    private String color;
    private int height;
    private double weight;
    private int tailSize;

    public Dog(String color, int height, double weight, int tailSize) {
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.tailSize = tailSize;

        dogIndex ++;
    }

    // display static value
    public int getIndex() {
        return dogIndex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void say() {
        System.out.printf("%s says: %s! \n", this.name);
    }

    public void action(String action) {
        switch (action) {
            case "kick":
                System.out.println("You kick " + this.name);
                System.out.println(this.name + " roll's into a ball and explodes.");
                break;
            case "talk":
                System.out.println("You talk to the dog...");
            default:
                System.out.println(this.name + " looks back at you and wiggles his tail.");
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
