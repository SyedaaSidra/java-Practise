package Generics;
public class Dog extends Animal {
    
    Dog(String name){
        super(name);
    }
    public void sound(){
       System.out.println(name + "Bau bau..");
    }
}
