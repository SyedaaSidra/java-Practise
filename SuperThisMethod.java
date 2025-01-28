

class A{
  A(){
    System.out.println("in A");
  }
  A(int n){

    System.out.println("in int A");
  }
}

class B extends A{
    B(){
        super(5);
        System.out.println("in B");
      }

      B(int n){
        this();
        System.out.println("in int B");
      }
}

public class SuperThisMethod {
    public static void main(String[] args) {
     B b=new B(5);
    }
}
