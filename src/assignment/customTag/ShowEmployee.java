package assignment.customTag;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import beans.Employee;

public class ShowEmployee extends TagSupport {
	
	@Override
	public int doStartTag() throws JspException{
		return EVAL_BODY_INCLUDE;//skip body
	}
	@Override
	public int doEndTag() throws JspException{
		JspWriter out = pageContext.getOut();
		Collection<Employee> emp = repository.EmployRepository.getAllEmployee();
		try {
		  out.println("<table>");
		  for(Employee i : emp)
		  {
		  out.println("<tr>");
		  		out.println("<td>"+i.getEmpNo()+"</td>");
		  		out.println("<td>"+i.getEmpName()+"</td>");
		  		out.println("<td>"+i.getDepartment()+"</td>");
		  		out.println("<td>"+i.getDesignation()+"</td>");
		  		out.println("<td>"+i.getEmpSalary()+"</td>");
		  out.println("</tr>");	 
		  }
		  out.println("</table>");
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}

}
