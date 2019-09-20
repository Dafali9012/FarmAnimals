public class Barn {

    private int animalsIndex;
    private int maxAnimals;
    private FarmAnimal[] animals;

    public Barn() {
        animalsIndex = 0;
        maxAnimals = 1;
        animals = new FarmAnimal[maxAnimals];
    }

    public Barn(int maxAnimals) {
        animalsIndex = 0;
        this.maxAnimals = maxAnimals;
        animals = new FarmAnimal[this.maxAnimals];
    }

    public void addAnimal(FarmAnimal animal) {
        if(animalsIndex == animals.length) {
            System.out.printf("The barn is full!%n%n");
        }
        else
        {
            animals[animalsIndex] = animal;
            animalsIndex++;
        }
    }

    public int getMaxAnimals() {
        return maxAnimals;
    }

    public FarmAnimal[] getAnimals() {
        FarmAnimal[] animalsShort = new FarmAnimal[animalsIndex];
        int i = 0;
        while(i<animalsShort.length) {
            animalsShort[i]=animals[i];
            i++;
        }
        return animalsShort;
    }
}
