package Practice.Algorithms.GraphTheory.Ticket;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Practice.Algorithms.GraphTheory.Ticket.Solution. */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        try {
            s = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int numberOfPeople = Integer.parseInt(s.split(" ")[0]);
        int numberOfTicketWindows = Integer.parseInt(s.split(" ")[1]);
        int numberOfDestinations = Integer.parseInt(s.split(" ")[2]);

        System.out.println(numberOfPeople);
        System.out.println(numberOfTicketWindows);
        System.out.println(numberOfDestinations);
    }
}