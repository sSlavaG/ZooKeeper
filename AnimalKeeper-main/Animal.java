import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;


// Initializing abstract class Animal which will not be instantiated.
abstract class Animal {
    // Initialize variables for name, allowed food and dietType.
    private String name = new String();
    private ArrayList<String> allowedFood = new ArrayList<>();
    private String dietType = new String();
    // Initialize a boolean variable and method which check if the animal likes to live in a group.
    private boolean solitary;
    private int currentHomeNumber;

    Animal() {

    }

    Animal(String name) {
        this.name = name;
    } 

    // Initialize an ArrayList which tracks other type of animals the animal can live with.
    // private ArrayList<Animal> allowedTypes = new ArrayList<>();


    //Getters and Setters for Animal fields 
    public String getAnimalName() {
        return this.name;
    }

    public ArrayList<String> getAllowedFood() {
        return this.allowedFood;
        
    }

    public void setAllowedFood(String food) {
        this.getAllowedFood().add(food);

    }

    public String getDietType() {
        return this.dietType;
    }

    public void setDietType(String dietType) {
        this.dietType = dietType;
    }

    public boolean isSolitary() {
        return this.solitary;
    }

    public void setSolitary(boolean solitary) {
        this.solitary = solitary;
    }
}

// Initializing dietTypes that inherit from superclass Animal

class Herbivore extends Animal {
    Herbivore() {
        this.setAllowedFood(new Hay().getName());
        this.setAllowedFood(new Corn().getName());
        this.setAllowedFood(new Grain().getName());
        this.setAllowedFood(new Carrots().getName());
        this.setDietType("Herbivore");
    }

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
    Carnivore() {
        this.setAllowedFood(new Chicken().getName());
        this.setAllowedFood(new Beef().getName());
        this.setDietType("Carnivore");

    }

    Carnivore(String name) {
        super(name);
        this.setAllowedFood(new Chicken().getName());
        this.setAllowedFood(new Beef().getName());
        this.setDietType("Carnivore");
    }


}

class Omnivore extends Animal {
    Omnivore() {
        this.setAllowedFood(new Carrots().getName());
        this.setAllowedFood(new Chicken().getName());
        this.setAllowedFood(new Beef().getName());
        this.setDietType("Omnivore");

    }

    Omnivore(String name) {
        super(name);
        this.setAllowedFood(new Carrots().getName());
        this.setAllowedFood(new Chicken().getName());
        this.setAllowedFood(new Beef().getName());
        this.setDietType("Omnivore");
    }
}




class Lion extends Carnivore {
    private String className;
    Lion(String name) {
        super(name);
        className = "Lion";
        setSolitary(false);


    }

    public String getClassName() {
        return className;
    }

    
}

class Tiger extends Carnivore {
    private String className;
    Tiger(String name) {
        super(name);
        className = "Tiger";
        setSolitary(true);
        
    }

    public String getClassName() {
        return className;
    }


}

class Leopard extends Carnivore {
    private String classname;
    Leopard(String name) {
        super(name);
        classname = "Leopard";
        setSolitary(true);

    }

    public String getClassname() {
        return classname;
    }


}

class Zebra extends Herbivore {
    private String classname;
    Zebra(String name) {
        super(name);
        classname = "Zebra";
        setSolitary(false);
    }

    public String getClassname() {
        return classname;
    }
}

class Antelope extends Herbivore {

    private String classname;
    Antelope(String name) {
        super(name);
        // Overriding Herbivore construct to make sure Antelopes don't eat carrots
        this.getAllowedFood().remove(new Carrots().getName());
        setSolitary(false);
        classname = "Antelope";
    }

    public String getClassname() {
        return classname;
    }

}

class Giraffe extends Herbivore {
    private String className;
    Giraffe(String name) {
        super(name);
        setSolitary(false);
    }


    public String getClassName() {
        return className;
    }
}

class Bear extends Omnivore {
    private String className;
    Bear(String name) {
        super(name);
        setSolitary(true);
    }

    public String getClassName() {
        return className;
    }

}
