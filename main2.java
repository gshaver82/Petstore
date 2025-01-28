// public class Main {
//     public static void main(String[] args){
//         System.out.println("Hello world");
//     }
//     Animal myPet = new Cat("pixie");
//     System.out.println(myPet.getID());
// }

// abstract class Animal{
//     static int count = 0;
//     String name;
//     abstract void move();
// }
// class Cat extends Animal{
//     private String ID;
//     void move(){
//         System.out.println("this cat zooms");
//     }
//     String getID(){
//         return this.ID;
//     }
//     Cat(String name){
//         this.name = name;
//         this.ID = "secret ID";
//     }
// }