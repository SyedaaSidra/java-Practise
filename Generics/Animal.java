package Generics;
 abstract public class Animal {
  String name;
   Animal(String name)    {
    this.name=name;
   }
abstract void sound();

  @Override
  public String toString(){
    return this.name;
  }
}
