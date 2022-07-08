import java.io.*;
public class TestThrowAndThrows  
{  
    static void method() throws IOException, ArithmeticException
    {  
        System.out.println("Inside the method()");  
        throw new IOException("throwing ArithmeticException");  
    }  
    
    public static void main(String args[])  
    {  
        try  
        {  
            method();  
        }  
        catch(Exception e)  
        {  
            System.out.println("caught in main() method = "+e.getMessage());  
        }  
    }  
}  