public class Sheep extends FarmAnimal {
    public Sheep() {

    }

    public Sheep(String name) {
        super(name, "Baa");
    }

    @Override
    public String toString() {
        return "The sheep named " + getName() + " makes the sound: " + noise();
    }
}
