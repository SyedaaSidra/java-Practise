package Generics;
public class Cat extends Animal {
     Cat(String name){
        super(name);
    }
    public void sound(){
        System.out.println(name + "Meow..");
    }
}
