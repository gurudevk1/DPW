package com.guru;

import java.util.*;

/*
 * 
 1: Program for hash code Interpretation Given a hash code (positive integer), write a function that will return all the possible strings that can be created from this hash code. Hash code Range: 0 to 2ˆ32. All the strings would the Upper-case alphabets.

Ex: Input: 123 Output: [ABC, LC, AW]

123 can be interpreted in the following ways:

1, 2, 3 ---> ABC
12, 3 ---> LC
1, 23 ---> AW
Input: 7678678 Output: GFGHFGH
 * */
public class DPW_Problem1 {
	static List<String> r=new LinkedList<String>();
	public static String str[]= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T",
				"U","V","W","X","Y","Z"};

	public static void main(String[] args) {
		r=new LinkedList<>();
		String in="123";
		//String in="100";
		//String in="999";
		String s=new String();
		decodeAll(in,0,s);
		
		//-1
		for(String t:r) {
			System.out.println(t);
		}
	}

	private static void decodeAll(String in,int indx,String s) {
		if(indx==in.length()) {
			r.add(s);
			return;
		}
		
		int ch=Integer.parseInt(in.substring(indx, 1 + indx));
		if(ch==0) {
			decodeAll(in,indx+1,s);
		}else {
			String t=s+str[ch-1];
			decodeAll(in,indx+1,t);
		}
		if ((indx+1)<in.length()) {
			int x = Integer.parseInt(in.substring(indx, 2 + indx));
			if (x == 0) {
				r = new LinkedList<>();
				r.add(new String("-1"));
				return;
			} else if (x < 27) {
				String t1 = s+str[x-1];
				decodeAll(in, indx + 2, t1);
			} 
		}
	}

}
