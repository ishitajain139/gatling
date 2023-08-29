package com.sks;

public class EmployeeCreationRequest {
	
	private String empName;

    //private String empNumber;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    

    @Override
	public String toString() {
		return "EmployeeCreationRequest [empName=" + empName + ", empNumber=" + /*empNumber +*/ "]";
	}

	/*
	 * public String getEmpNumber() { return empNumber; }
	 * 
	 * public void setEmpNumber(String empNumber) { this.empNumber = empNumber; }
	 */

}
