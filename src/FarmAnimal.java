public abstract class FarmAnimal {

    protected String name;
    protected String noise;

    public FarmAnimal() {

    }

    public FarmAnimal(String name, String noise) {
        setName(name);
        this.noise = noise;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String noise() {
        return noise;
    }

    public String toString() {
        String animalAndNoise = "Animal " + name + " makes the sound " + noise;
        return animalAndNoise;
    }
}
