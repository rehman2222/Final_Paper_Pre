import java.io.*;
import java.lang.ArithmeticException;
public class Airthmatic_Exception {
    
    public static void main(String x[]){
        try{
        int z = 100/0;
        System.out.println("THis wil not be execute");
        
        }
        catch(ArithmeticException e ){
            System.out.print(e);
            
        }
    }
}
