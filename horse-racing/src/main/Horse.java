package main;

import java.util.*;

public class Horse {

	public static void main(String[] args) {
	
		
		int[] N = {5,15,17,3,8,11,6,55,7};
		
		List<Integer> list = new ArrayList<Integer>();
		
		
        for (int i = 0; i < N.length; i++) {            
        	list.add(N[i]);            
        }
       
        Collections.sort(list);
        
        System.out.println(list);
        
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
	}

}
