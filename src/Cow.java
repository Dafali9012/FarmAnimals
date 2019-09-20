public class Cow extends FarmAnimal {
    public Cow() {

    }

    public Cow(String name) {
        super(name, "Moo");
    }

    @Override
    public String toString() {
        return "The cow named " + getName() + " makes the sound: " + noise();
    }
}
