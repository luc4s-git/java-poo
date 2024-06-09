package Thing;

public class Muadib extends Fremen {
    public Muadib(String name, int height, int weight, String stateOfMind) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.stateOfMind = stateOfMind;
    }

    @Override
    public void say() {
        System.out.printf("%s humbly says: I am no messiah! \n", this.name);
    }
}
