package Practice.Java.Introduction.JavaEndOfFile;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int counter = 1;
        while (in.hasNext()) {
            String a = in.nextLine();
            System.out.println(counter + " " + a);
            counter++;
        }
    }
}
