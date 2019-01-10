package main;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();
            System.err.println(pi);
            list.add(pi); 
        }

        Collections.sort(list);
 
 
        Integer result = null;
        Integer tmp = null;
               
	    for (int i = 0; i < list.size()-1; i++) {
			tmp = list.get(i+1) - list.get(i);
			if (result == null) {
				result = tmp;
			} else if (tmp < result) {
				result = tmp;
			}
			
		}
	    
	   System.out.println(result);
	    
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        
    }
}