package com.guru.DPW;

import java.util.*;

public class EmployeeHistory {
	
	String joiningDate;
	Designation designation;
	HashMap<String,Designation> dateVsDesignationMap=new LinkedHashMap<String,Designation>();
	
	EmployeeHistory(String jd,Designation d){
		joiningDate=jd;
		designation=d;
		dateVsDesignationMap.put(jd,d);
	}
	public void getEmployeeHistory() {
		for(Map.Entry<String,Designation> entry:dateVsDesignationMap.entrySet()) {
			System.out.println("Date "+entry.getKey()+" Designation " +entry.getValue());
		}
	}
	public void updateEmployeeHistory(String d,Designation dx) {
		dateVsDesignationMap.put(d,dx);
	}
	

}
