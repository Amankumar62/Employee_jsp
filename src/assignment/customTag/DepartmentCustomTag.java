package assignment.customTag;

import java.util.Collection;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import beans.Employee;

public class DepartmentCustomTag extends TagSupport {
	private String name;
	public float sal=0;
	public int count=1;
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int doStartTag() throws JspException{
		return EVAL_BODY_INCLUDE;//skip body
	}
	public int doEndTag() throws JspException{
		JspWriter out = pageContext.getOut();
		Collection<Employee> emp = repository.EmployRepository.getAllEmployee();
		for(Employee i:emp) {
			if(i.getDepartment().equals(name)) {
				sal+=i.getEmpSalary();
				count++;
			}
		}
		float avgSal= (sal/count);
		
		try {
			out.println("<h2>The average salary of "+name+" Department is "+avgSal+"</h2>");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}
}
