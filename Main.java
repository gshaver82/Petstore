public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        Pet pixie = new Cat("pixie", "torty");
        Cat max = new Cat("max", "grey tabby", "missing tail");
        pixie.printOutDetails();
        max.printOutDetails();
        pixie.move();//runtime polymorphism reference type Pet is a cat object 
        max.move();
        System.out.println(pixie.name);
        System.out.println(max.name);
        System.out.println(Pet.getTotalSold());
        Dog wolfy = new Dog();
        System.out.println(wolfy.calledby);
        wolfy.move();
        System.out.println(max.name); 
        //if class Pet were in a different package the protected would prevent above line from working 
        System.out.println(max.getID());
    }
}

abstract class Pet {
    private static int totalInStock = 0; //private encapsulation
    private static int totalSold = 0;    
    public static int getTotalInStock() {
        return totalInStock;
    }    
    public static int getTotalSold() {
        return totalSold;
    }
    public void incrementTotalSold() {
        totalSold++;
    }
    
    // DOB, Medical records, etc
    protected String name;//protected  encapsulation again would work better if Pet were a separate package in a different file 
    String petSpecies;
    String breed;
    String notes;
    abstract void move();
    abstract String getName();
    abstract void setName(String name);
    abstract void printOutDetails();

}

class Cat extends Pet {
    private String ID;
    String getID(){
        return this.ID;
    }

    @Override
    void move() {
        System.out.println(name + " runs and jumps");
    }

    @Override
    String getName(){
        return name;
    };
    @Override
    void setName(String name){
        this.name = name;
    };
    void printOutDetails() {
        System.out.println(name + " is a " + breed + " " + petSpecies + " notes: " + notes);
    }

    Cat(String name, String breed) {//overload
        incrementTotalSold();
        setName(name);
        this.breed = breed;
        this.petSpecies = "cat";
        this.ID = "secret ID";
    }

    Cat(String name, String breed, String notes) {//overload
        incrementTotalSold();
        setName(name);
        this.breed = breed;
        this.petSpecies = "cat";
        this.notes = notes;
        this.ID = "secret ID";
    }
}
class Dog extends Pet{
    String calledby = "rover";
    void printOutDetails() {
        System.out.println(name + " is a " + breed + " " + petSpecies + " notes: " + notes);
    }
    @Override
    void move() {
        System.out.println(calledby + " the dog runs and jumps");
    }
    String getName(){
        System.out.println("dog getName");
        return "dog getName";
    };
    void setName(String name){
        System.out.println("dog setName");
    };
}