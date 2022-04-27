package feature;

public class MainApp {
	public static void main(String args[])
	{  
		        
		        Employee emp = new Employee();  
		        
		        emp.setEmp_id(101);  
		        emp.setName("Emma Watson");  
		        emp.setSalary(1500);    
		        emp.setEmail("Emmawatson123@gmail.com");  
		          
		        
		        System.out.println(emp);  
		        
		        int sal = emp.getSalary();  
		        int increment = 0;   
		        if ((sal >=1000) && (sal <=1500))              //incrementing salary 2%
		        {  
		              
		            increment += (sal * 2)/100;  
		            sal = sal+increment;  
		              
		            emp.setSalary(sal);  
		            System.out.println("\n Salary is incremented \n");  
		            System.out.println(emp);  
		              
		        }else if ((sal >=1500) && (sal <=20000)){  			//incrementing salary 5%
		              
		            increment += (sal * 5)/100;  
		            sal = sal+increment;  
		              
		            emp.setSalary(sal);  
		            System.out.println("\n Salary is incremented \n");  
		            System.out.println(emp);  
		        }else {  
		            System.out.println("\n Salary is not incremented \n");  
		            System.out.println(emp);  
		        }
       
	}
	
	
}
