package com.guru;

import java.util.*;
import java.util.PriorityQueue;

public class DPW_Problem3 {
	class Loc{
		String ip;
		int hit=0;
	}
	class LocComparator implements Comparator<Loc>{ 
		public int compare(Loc s1, Loc s2) { 
           
            return s1.hit - s2.hit; 
            } 
	}
	public static void main(String[] args) {
		//we will use heap
		
		PriorityQueue<Loc> q=new PriorityQueue<Loc>(); 	
		//update the q with ip address hit 
		//get top 20
		int cnt=20;
		 Iterator<Loc> itr3 = q.iterator(); 
	        while (itr3.hasNext() && cnt>0) { 
	            System.out.println(itr3.next().ip); 
	            cnt--;
	        }
	}

}
