// 1. Create a Java program to print occupied memory before memory allocation of an object, after memory allocation of an object, and after deallocation of an object.
package Tasks;

public class Task1 {
 String name;

   
    public static void PrintMemory(String name){

    Runtime rt = Runtime.getRuntime();
    long totalMemory = rt.totalMemory(); 
    System.out.println("Total memory "+totalMemory);
     long freeMemory = rt.freeMemory(); 
     System.out.println("Available memory "+freeMemory);
    System.out.println(name+(totalMemory-freeMemory));
    System.err.println("#############");
    }
    
    public static void main (String[] args){
        PrintMemory("used memory before allocation ");
        byte[] bigArray = new byte[100_000_00]; 
        PrintMemory(" used memory After allocation ");
       bigArray=null;
       PrintMemory(" used memory After deallocation ");
    }
}
