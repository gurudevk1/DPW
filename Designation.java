package com.guru.DPW;

public enum Designation {
	SDE1,
	SDE2,
	SDE3;
	int id=0;
	public static Designation getDesignationById(int d) {
		Designation designation=null;
		switch (d) 
	    { 
	    case 0:
	    	designation=Designation.SDE1;
	    	designation.id=1;
	    	break;
	    case 1:
	    	designation=Designation.SDE2;
	    	designation.id=2;
	    	break;
	    case 2:
	    	designation=Designation.SDE3;
	    	designation.id=3;
	    	break;	
	    }
		return designation;
	}
}
