package com.guru.DPW;

import com.guru.DPW.Designation;


public class Employee {
	int employeeID;
	String employeeName;
	Designation designation;
	EmployeeHistory employeeHistory;
	Boolean status=true;
	
	Employee(int id,String name,int d,String jd){
		employeeID=id;
		employeeName=name;
		designation=Designation.getDesignationById(d);
		
		employeeHistory =new EmployeeHistory(jd,designation);
		
	}
	
	public void getEmplyDetails() {
		System.out.println("ID "+employeeID+" Employee Name "+employeeName+" Designation "+designation);
	}
	public void promote(String date) {
		designation=Designation.getDesignationById(this.designation.id+1);
		employeeHistory.updateEmployeeHistory(date, designation);
	}
	public void getEmployeeHistory(){
		employeeHistory.getEmployeeHistory();
	}

	public void updateStatus(boolean b) {
		status=false;
	}

}
