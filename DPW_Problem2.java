package com.guru;

import java.util.*;

/*
 * 2: Random Number Generator Assume a Random number generator between 1 - 100 Million. 
 * Write a function that generates 25 million distinct numbers in random order in minimal time and spac
 * */
public class DPW_Problem2 {
	

	public static void main(String[] args) {
		HashSet<Integer> s=new HashSet<Integer>();
		//xor of all the number
		int cnt=25000000;
		s.add(0);
		Random rand = new Random(99999999); 
		while(cnt>0){
            int random =Math.abs(rand.nextInt());
            if(!s.contains(random)) {
            	cnt--;
            	System.out.println(random);
            	s.add(random);
            }
         }
	}

}
