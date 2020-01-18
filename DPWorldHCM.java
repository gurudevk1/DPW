package com.guru.DPW;

import java.util.*;

public class DPWorldHCM {
	private static HashMap<Integer,Employee> idVsEmplMap=new HashMap<Integer,Employee>();
	private static int id=0;
	
		public static void main(String[] args) {
		int cnt=5;
		 while(cnt>0) {
			 cnt--;
			Scanner myObj = new Scanner(System.in);
		    System.out.println("Enter Operation 1 Add 2 Remove 3 Promote");
		    int op=myObj.nextInt();
		    myObj.nextLine();
		   
		    //System.out.println("Username is: " + userName);  // Output user input
			switch (op) 
	        { 
	        case 0:
	        	//int id,String name,int d,String jd
	        	System.out.println("Enter Empl Name");
	        	String userName = myObj.nextLine();
	        	System.out.println("Enter Empl Designation");
	        	String designation = myObj.nextLine();
	        	Employee e=new Employee(id,userName,Integer.parseInt(designation),"2020");
	        	idVsEmplMap.put(id,e);
	        	id++;
	        	
	        	break;
	        case 1:
	        	System.out.println("Enter Empl ID to remove");
	        	int e_idr=myObj.nextInt();
	        	idVsEmplMap.get(e_idr).updateStatus(false);
	        	break;
	        case 2:
	        	System.out.println("Enter Empl ID to Promote");
	        	int e_id=myObj.nextInt();
	        	idVsEmplMap.get(e_id).promote("2021");
	        	break;	
	        }
		}
		}

}
