package repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import beans.Employee;

public class EmployRepository {
  private static Map<Integer, Employee> employees;
  
  static {
	  employees = new HashMap<>();
	  Employee e1 = new Employee(101,"Akshay","dept","Manager",125000.75f);
	  Employee e2 = new Employee(102,"Aman","hr","Manager",125000.75f);
	  Employee e3 = new Employee(103,"Gulam","purchase","Manager",125000.75f);
	  Employee e4 = new Employee(104,"Abhay","sales","Manager",125000.75f);
	  Employee e5 = new Employee(105,"Deol","hr","Manager",125000.75f);
	  Employee e6 = new Employee(106,"Salman","purchase","Manager",125000.75f);
	  Employee e7 = new Employee(107,"Kartik","hr","Manager",125000.75f);
	  Employee e8 = new Employee(108,"Sushant","sales","Manager",125000.75f);
	  Employee e9 = new Employee(109,"Shark","purchase","Manager",125000.75f);
	  Employee e10 = new Employee(110,"Whale","sales","Manager",125000.75f);
	  
	  employees.put(e1.getEmpNo(), e1);
	  employees.put(e2.getEmpNo(), e2);
	  employees.put(e3.getEmpNo(), e3);
	  employees.put(e4.getEmpNo(), e4);
	  employees.put(e5.getEmpNo(), e5);
	  employees.put(e6.getEmpNo(), e6);
	  employees.put(e7.getEmpNo(), e7);
	  employees.put(e8.getEmpNo(), e8);
	  employees.put(e9.getEmpNo(), e9);
	  employees.put(e10.getEmpNo(), e10);
  }
  
  public static void addEmployee(Employee newEmp) {
	    employees.put(newEmp.getEmpNo(),newEmp);

  }
  public static Employee getEmployee(Integer empNo) {
	  Employee emp = employees.get(empNo);
	  return emp;
  }
  public static void  deleteEmployeeById(Integer empNo) {
	  employees.remove(empNo);
  }
  public static Collection<Employee> getAllEmployee(){
	  Collection<Employee> allEmployees = employees.values();
	  return allEmployees;
  }
  
}
