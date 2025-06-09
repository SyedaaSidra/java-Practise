package Generics;
import java.util.ArrayList;
import java.util.List;
 interface Container<T> {
 void add(T item);

}

public class AnimalBoxGeneric<T extends Animal> implements Container<T> {
  List<T> list=new ArrayList<>();
    public void add(T animal){
        list.add(animal);
    }

    public  void makeSounds () {
        for(T animal:list){
           animal.sound();

    }
    }
    
    
}
