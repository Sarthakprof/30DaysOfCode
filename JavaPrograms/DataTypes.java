import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
	/*
	Sample Input
	12
	4.0
	is the best place to learn and practice coding!
	
	Sample Output
	16
	8.0
	HackerRank is the best place to learn and practice coding!
	*/
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.               
        int ia = scan.nextInt();
        double id = scan.nextDouble();
        scan.nextLine();
        String inputStr = scan.nextLine();        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + ia);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d + id);
       /* Concatenate and print the String variables on a new line; 
            the 's' variable above should be printed first. */       
        System.out.println(s + inputStr);       
		
        

        scan.close();