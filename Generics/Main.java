package Generics;

public class Main {
    public static void main(String[] args) {
        AnimalBoxGeneric<Dog> dogBox = new AnimalBoxGeneric<>();
        dogBox.add(new Dog("Buddy"));
        dogBox.add(new Dog("Max"));

        AnimalBoxGeneric<Cat> catBox = new AnimalBoxGeneric<>();
        catBox.add(new Cat("Whiskers"));
        catBox.add(new Cat("Luna"));

        dogBox.makeSounds(); 
        catBox.makeSounds();
    }
}
