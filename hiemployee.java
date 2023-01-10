import java.util.*;
import java.io.*;
class employeeSalary{
	int salary=45000;
}
class permanentEmployee extends employeeSalary{
	double hike=0.15;
	double grossSalary(){
		return (salary+salary*hike);
	}
}
class temporaryEmployee extends employeeSalary{
	double hike=0.05;
	double grossSalary(){
			return (salary+salary*hike);
	}
}
class hiemployee{
	public static void main(String[] args){
		permanentEmployee p=new permanentEmployee();
		temporaryEmployee t=new temporaryEmployee();
		System.out.println("Salary of permanentEmployee = " +p.salary);
		System.out.println("Salary after hike of permanentEmployee = " +p.grossSalary());
		System.out.println("Salary of temporaryEmployee = " +t.salary);
		System.out.println("Salary after hike of temporaryEmployee = " +t.grossSalary());
	}
}