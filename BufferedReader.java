import java.lang.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        
        InputStreamReader InputStreamReader = new InputStreamReader(System.in);
        
        BufferedReader reader = new BufferedReader(InputStreamReader);
        
        int firstInt = Integer.parseInt(reader.readLine());
        
        int secondInt = Integer.parseInt(reader.readLine());
        
        System.out.println(firstInt + " " + secondInt);
        
        reader.close();
    }
}