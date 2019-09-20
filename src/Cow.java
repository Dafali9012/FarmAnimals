public class Cow extends FarmAnimal {
    public Cow() {

    }

    public Cow(String name) {
        super(name,"Moo");
    }

    @Override
    public String toString() {
        String animalAndNoise = "The cow named " + getName() + " makes the sound: " + noise();
        return animalAndNoise;
    }
}
