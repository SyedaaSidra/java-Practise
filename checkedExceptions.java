import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class checkedExceptions {

    public void readFile() throws  FileNotFoundException{
    FileReader file = new FileReader("data.txt"); 
}
    public static void main(String[] args) {
        checkedExceptions checked=new checkedExceptions();
        try{
            checked.readFile(); 
        }catch(FileNotFoundException e){
           System.out.println(e);
        }
         
    }
}
