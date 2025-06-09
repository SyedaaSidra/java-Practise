package Generics;
public class Generics<T> {
    T PrinterVal;
   Generics(T PrinterVal){
        this.PrinterVal=PrinterVal;
      }
  public T print(){
    return PrinterVal;
    
  }
    public static void main (String[] args){
       Generics<Integer> printer=new Generics<>(23);
         System.out.println(printer.print());

         Generics<String> Strprinter=new Generics<>("hey");
         System.out.println(Strprinter.print());
       
       
    }
}
