package feature;

public class Employee {
	int emp_id, salary;  
	String name, email;
	
	public int getEmp_id() {  
	    return emp_id;  
	}  
	public void setEmp_id(int emp_id) {  
	    this.emp_id = emp_id;  
	}  
	public int getSalary() {  
	    return salary;  
	}  
	public void setSalary(int salary) {  
	    this.salary = salary*12;  
	}  
	public String getName() {  
	    return name;  
	}  
	public void setName(String name) {  
	    this.name = name;  
	}  
	
	public String getEmail() {  
	    return email;  
	}  
	public void setEmail(String email) {  
	    this.email = email;  
	}  
	
	@Override  
	public String toString() {  
		return "Employee [emp_id = " + emp_id + ", salary = " + salary + ", name = " + name +", email = " + email + "]"; 
	    }  
	
}
