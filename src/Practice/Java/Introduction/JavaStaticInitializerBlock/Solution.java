package Practice.Java.Introduction.JavaStaticInitializerBlock;

import java.io.*;

public class Solution {

    static boolean flag;
    static int B;
    static int H;

    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            B = Integer.parseInt(reader.readLine());
            H = Integer.parseInt(reader.readLine());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (B > 0 && H > 0) flag = true;
        else System.out.println("java.lang.Exception: Breadth and height must be positive");
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class
