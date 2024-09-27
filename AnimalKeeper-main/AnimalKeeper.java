import java.util.ArrayList;
import java.util.Scanner;

public class AnimalKeeper {

    public ArrayList<String> getInput() {
        // Initialize a Scanner object and an ArrayList representative for the input.
        Scanner scan = new Scanner(System.in);
        ArrayList<String> commandLine = new ArrayList<>();

        // Gets input for the problem.
        while (scan.hasNext()) {
            commandLine.add(scan.nextLine());
        }

        scan.close();// Closes the scanner.

        // Return the ArrayList.
        return commandLine;
    }

    // Perform actions according to the given input.
    public void run() {

        ArrayList<String> commandLine = getInput();

        /* Initialize a variable which will track the current index.
         * Start reading from index 1 as the first line of the program must always be the same.
         */
        int currentIndex = 1;

        while (currentIndex < commandLine.size()) {
            // Initialize a switch statement which performs commands according to the current ID.
            switch (Integer.valueOf(commandLine.get(currentIndex))) {
                case 0:
                    // Initialize the animal's number ID and its name.
                    int animalID = Integer.valueOf(commandLine.get(currentIndex+1)); 
                    String animalName = commandLine.get(currentIndex + 1);

                    // Break out of the command if there is another animal with the same name.
                    if(MyZoo.animalList.contains(animalName)) {
                        System.out.println("0!");
                        break;
                    }

                    // Initialize an Animal object according to the previously mentioned variables.
                    Animal.animalTypes.get(animalID) ani = new Animal.animalTypes.get(animalID)(commandLine.get(currentIndex + 2));
                case 1:
                case 2:
                case 4:
                case 5:
                default:
                    break;


            }
        }
    }

    public static void main(String[] args) throws Exception {
        new AnimalKeeper().run();
    }
}
