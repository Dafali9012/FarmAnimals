import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

    private static Barn barn;

    public static void main(String[] args) {
        System.out.print("Choose how many animals will fit in the barn: ");
        barn = new Barn(intInput());
        System.out.printf("%n");
        selection();
    }

    private static void selection() {
        System.out.printf("1. Add animal%n%n");
        System.out.printf("2. Listen to the animals in the barn%n%n");
        System.out.printf("3. Quit%n%n");
        System.out.printf("What do you want to do: ");
        int choice = intInput();
        System.out.printf("%n");
        switch (choice) {
            case 1:
                addAnimal();
                break;
            case 2:
                makeSomeNoise();
                break;
            case 3:
                break;
            default:
                System.out.printf("Selection unknown%n%n");
                selection();
                break;
        }
    }

    private static void addAnimal() {
        if(barn.getAnimals().length == barn.getMaxAnimals())
        {
            System.out.printf("The barn is full!%n%n");
        }
        else
        {
            System.out.printf("What type of animal do you want to add: ");
            String animalChoice = stringInput();
            System.out.printf("What would you like to name the animal: ");
            String animalName = stringInput();
            if(animalChoice.equalsIgnoreCase("Cow"))barn.addAnimal(new Cow(animalName));
            if(animalChoice.equalsIgnoreCase("Sheep"))barn.addAnimal(new Sheep(animalName));
            System.out.printf("%n");
        }
        selection();
    }

    private static void makeSomeNoise() {
        if(barn.getAnimals().length==0)
        {
            System.out.printf("The barn is empty!%n");
        }
        for(FarmAnimal fam : barn.getAnimals()){
            System.out.printf(fam.toString()+"%n");
        }
        System.out.printf("%n");
        selection();
    }

    private static int intInput() {
        boolean success = false;
        int input = 0;
        Scanner scan = new Scanner(System.in);
        do {
            try {
                input = scan.nextInt();
                success = true;
            } catch (InputMismatchException e) {
                System.out.print("Illegal input: ");
                scan.nextLine();
            }
        }
        while (!success);
        scan.nextLine();
        return input;
    }

    private static String stringInput() {
        boolean success = false;
        String input = "";
        Scanner scan = new Scanner(System.in);
        do {
            try {
                input = scan.nextLine();
                success = true;
            } catch (InputMismatchException e) {
                System.out.print("Illegal input: ");
            }
        }
        while (!success);
        return input;
    }
}
