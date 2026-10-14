class Animal{
    public void eat(){
        System.out.println("eating...");
    }
    public void sound(){
        System.out.println("Animal sound...");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("Barking...");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("Meowing...");
    }
}
// class Car{
//     String color;
//     Car(String a){
//         this.color = a;
//     }
//     void display(){
//         System.out.println("This is a car :"+this.color);
//     }
// }
// class Ford extends Car{
//     Ford(String a){
//         super(a);
//     }
//     void display(){
//         System.out.println("This is a Ford car");
//     }
//     void show(){
//         System.out.println("This is a Ford car with advanced features");
//     }
// }
// class Benz extends Ford{
//     Benz(String a){
//         super(a);
//     }
//     void show(){
//         System.out.println("This is a Benz car with luxury features");
//     }
// }
public class Inheritance{
    public static void main(String args[]){
        
        
        Animal b=new Animal();
        b.sound();
        
    }
}