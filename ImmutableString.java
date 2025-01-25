class User {
    
}

public class ImmutableString {
    public static void main(String[] args) {
      String name ="sidra";
      System.out.println(System.identityHashCode(name));
       name="haya";
       System.out.println(name);
       String Sdra="sidra";
       System.out.println(System.identityHashCode(Sdra));
       
    }
}
