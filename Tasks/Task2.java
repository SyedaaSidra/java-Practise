// 2. Create a Java program that runs infinitely until the garbage collection does not reclaim an unreferenced object's occupied memory.
package Tasks;

public class Task2 {
   public static long usedMemory(Runtime rt){
     return  rt.totalMemory()-rt.freeMemory();
   }
    
  public static void main(String[] args) throws InterruptedException {
    int iterations=0;
    Runtime rt = Runtime.getRuntime();
    long beforeAllocation=usedMemory(rt);
    System.out.println(beforeAllocation);
    byte[] bigArray = new byte[100_000_00]; 

    long beforeDeAllocation=usedMemory(rt);
     System.out.println(beforeDeAllocation);
    bigArray=null;
     long AfterDeAllocation=usedMemory(rt);
      System.out.println(AfterDeAllocation);
 while(true){
    AfterDeAllocation=usedMemory(rt);
   
    iterations++;
    if(AfterDeAllocation < beforeDeAllocation){
       break;
    }
      
     Thread.sleep(1000);
 }
 System.out.println("iterations"+iterations);
  }  
}
