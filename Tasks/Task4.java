package Tasks;
import java.util.*;
// 4. Implement producer-consumer problem such that a Chef cooks meal until the order list is not empty, and multiple Customer orders to eat until the order-list is not full. Be sure to print the user name when he orders anything.

class Orderlist{
   Queue<String> li = new LinkedList<>();
    int capacity;
     Orderlist(int capacity){
          this.capacity=capacity;
     }

     public synchronized void placeOrder(String name){
         while (li.size() == capacity) {
            try {
                wait(); // wait if full
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        li.add(name);
        System.out.println("Customer " + name + " placed an order");
        notifyAll();
    }
     

     public synchronized void chefCooks(){
      
             while (true) {
            while (li.isEmpty()) {
                try {
                    wait(); // wait if empty
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            String order = li.remove();
            System.out.println("Chef prepared order for: " + order);
            notifyAll();

          
        }
     }
   
    
}
class Producer extends Thread{
    Orderlist lists;
    Producer (Orderlist lists){
        this.lists=lists;
    }
    public void run(){
        lists.chefCooks();
    }

}
class Customer extends Thread{
   Orderlist lists;
   String name;
    Customer (Orderlist lists ,String name){
        this.lists=lists;
        this.name=name;
    }
    public void run(){
        lists.placeOrder(name);
    }
}
public class Task4 {
    public static void main(String[] args) {
       Orderlist order=new Orderlist(5);
       Thread chef=new Producer(order);
       chef.start();
       Thread c1=new Customer(order,"Sara");
       Thread c2=new Customer(order,"John");
       Thread c3=new Customer(order,"Haya");
       Thread c4=new Customer(order,"Ali");
       Thread c5=new Customer(order,"Kiran");
       c1.start();
       c2.start();
       c3.start();
       c4.start();
       c5.start();
       


    }
}
