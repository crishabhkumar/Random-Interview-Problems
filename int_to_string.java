/*You are given an integer , you have to convert it into a string.
Please complete the partially completed code in the editor. 
If your code successfully converts  into a string  the code will print "Good job". 
Otherwise it will print "Wrong answer". can range between -100 to 100 inclusive.*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String name = Integer.toString(n);
        if(n==Integer.parseInt(name))
            {
                System.out.println("Good job");
            }
            else
            {
                System.out.println("Wrong answer.");
            }
        
    }
}
