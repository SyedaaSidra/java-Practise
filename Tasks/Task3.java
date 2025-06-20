package Tasks;
// 1. Create a Java program to print numbers from 1 through 100 using 2 threads; one for odd and the other for even numbers.

 class Printer{
    int value=1;
    int Max=100;

    public synchronized void odd(){

        while(value<=Max){
            if(value%2==0){
      try{
           wait();
       }catch(InterruptedException e){
           e.printStackTrace();
       }
    }else{

        System.out.println("Odd num: " + value);
        value++;
        notify();
    }
            }
        }


     public synchronized void even(){

        while(value<=Max){
            if(value%2!=0){
      try{
           wait();
       }catch(InterruptedException e){
           e.printStackTrace();
       }
    }else{

        System.out.println("Even num: " + value);
        value++;
        notify();
    }
            }
        }
      
 }
class Odd extends Thread{
  Printer printer;
   Odd(Printer printer){
    this.printer=printer;
}
public void run(){
    printer.odd();
}
  
}

class Even extends Thread{

     Printer printer;
   Even(Printer printer){
    this.printer=printer;
}
public void run(){
    printer.even();
}
}

public class Task3 {
   
    public static void main(String[] args) {
         Printer printer=new Printer();
    Thread t1=new Odd(printer);
    Thread t2=new Even(printer);
    t1.start();
    t2.start();
    }
}
