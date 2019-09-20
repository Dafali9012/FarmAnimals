public class Sheep extends FarmAnimal {
    public Sheep() {

    }

    public Sheep(String name) {
        super(name,"Baa");
    }

    @Override
    public String toString() {
        String animalAndNoise = "The sheep named " + getName() + " makes the sound: " + noise();
        return animalAndNoise;
    }
}
