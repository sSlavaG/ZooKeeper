import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;



abstract class Animal {
    // Initialize variables for name and allowed food.
    private String name = new String();
    private ArrayList<String> allowedFood = new ArrayList<>();

    Animal(String name) {
        this.name = name;
    } 

    // Declare a variable which will store the animal type as a String.
    private String typeString = new String();

    // Initialize an ArrayList which tracks other type of animals the animal can live with.
    ArrayList<Animal> allowedTypes = new ArrayList<>();

    // Initialize a boolean variable and method which check if the animal likes to live in a group.
    boolean solitary = false;

    private String dietType = new String("");

    // Initialising a set of animal names to keep track of unique names
    // Set is static and belongs to a whole animal class
    static Set<String> setOfAnimalNames = new HashSet<>();

    int checkForName(String nameToCheck) {
        if (setOfAnimalNames.contains(nameToCheck)) {
            return 0;
        } else {
            setOfAnimalNames.add(nameToCheck);
            return 1;
        }

        
    } 
    

    String getAnimalName() {
        return this.name;
    }

    ArrayList<String> getAllowedFood() {
        return this.allowedFood;
        
    }

    void setAllowedFood(String food) {
        this.getAllowedFood().add(food);

    }

    String getDietType() {
        return this.dietType;
    }

    void setDietType(String dietType) {
        this.dietType = dietType;
    }
}

class Herbivore extends Animal {
    Herbivore(String name) {
        super(name);
        this.setAllowedFood(new Hay().getName());
        this.setAllowedFood(new Corn().getName());
        this.setAllowedFood(new Grain().getName());
        this.setAllowedFood(new Carrots().getName());
        this.setDietType("Herbivore");
    }
}

class Carnivore extends Animal {

    Carnivore(String name) {
        super(name);
        this.setAllowedFood(new Chicken().getName());
        this.setAllowedFood(new Beef().getName());
        this.setDietType("Carnivore");
    }


}

class Omnivore extends Animal {
    Omnivore(String name) {
        super(name);
        this.setAllowedFood(new Carrots().getName());
        this.setAllowedFood(new Chicken().getName());
        this.setAllowedFood(new Beef().getName());
        this.setDietType("Omnivore");
    }
}

class Lion extends Carnivore {
    Lion(String name) {
        super(name);


    }
}

class Tiger extends Carnivore {
    Tiger(String name) {
        super(name);

        
    }
}

class Leopard extends Carnivore {
    Leopard(String name) {
        super(name);
    }
}

class Zebra extends Herbivore {
    Zebra(String name) {
        super(name);
    }
}

class Antelope extends Herbivore {
    Antelope(String name) {
        super(name);
        // Overwriting Herbivore construct to make sure Antelopes don't eat carrots
        this.setAllowedFood(new Hay().getName());
        this.setAllowedFood(new Corn().getName());
        this.setAllowedFood(new Grain().getName());
    }

}

class Giraffe extends Herbivore {
    Giraffe(String name) {
        super(name);
    }
}

class Bear extends Omnivore {
    Bear(String name) {
        super(name);
    }
}
