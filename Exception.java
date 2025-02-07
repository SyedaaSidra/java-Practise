public class Exception {
    public void validate(int age) {
        if (age < 18) {
            System.out.println("Not eligible to vote"); // Just prints a message
        }
        System.out.println("Proceeding with voting process...");
    }

    public void validateWithThorw(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Not eligible to vote"); // Stops execution
        }
        System.out.println("Proceeding with voting process...");
    }
    
public static void main(String[] args) {
    Exception e=new Exception();
    // e.validate(16);
    e.validateWithThorw(16);
    System.out.println();
}    
    
}
