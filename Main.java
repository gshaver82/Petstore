public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        Cat pixie = new Cat("pixie", "torty");
        Cat max = new Cat("max", "grey tabby", "missing tail");
        pixie.printOutDetails();
        max.printOutDetails();
        pixie.move();
        max.move();
        System.out.println(Pet.totalSold);
        Dog wolfy = new Dog();
        System.out.println(wolfy.calledby);
        wolfy.move();
        System.out.println(max.name); 
        //if class Pet were in a different package the protected would prevent above line from working 
    }
}

abstract class Pet {
    static int totalInStock = 0;
    static int totalSold = 0;
    // DOB, Medical records, etc
    protected String name;
    String petSpecies;
    String breed;
    String notes;
    abstract void move();
    abstract String getName();
    abstract void setName(String name);
}

class Cat extends Pet {
    @Override
    void move() {
        System.out.println(name + " runs and jumps");
    }

    void printOutDetails() {
        System.out.println(name + " is a " + breed + " " + petSpecies + " notes: " + notes);
    }
    @Override
    String getName(){
        return name;
    };
    @Override
    void setName(String name){
        this.name = name;
    };

    Cat(String name, String breed) {//overload
        totalSold ++;
        setName(name);
        this.breed = breed;
        this.petSpecies = "cat";
    }

    Cat(String name, String breed, String notes) {//overload
        totalSold ++;
        setName(name);
        this.breed = breed;
        this.petSpecies = "cat";
        this.notes = notes;
    }
}
class Dog extends Pet{
    String calledby = "rover";
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