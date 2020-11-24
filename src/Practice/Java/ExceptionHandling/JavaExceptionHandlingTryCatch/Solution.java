package Practice.Java.ExceptionHandling.JavaExceptionHandlingTryCatch;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int x = Integer.parseInt(reader.readLine());
            int y = Integer.parseInt(reader.readLine());
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        } catch (NumberFormatException e) {
            System.out.println(new InputMismatchException().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}