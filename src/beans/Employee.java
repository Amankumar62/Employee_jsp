package beans;

public class Employee {
	
	private int empNo;
	private String empName,department,designation;
	private float empSalary;
	

	
	public Employee(int empNo, String empName, String department, String designation, float empSalary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.department = department;
		this.designation = designation;
		this.empSalary = empSalary;
	}


	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getEmpNo() {
		return empNo;
	}


	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
   
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", department=" + department + ", designation="
				+ designation + ", empSalary=" + empSalary + "]";
	}



}
