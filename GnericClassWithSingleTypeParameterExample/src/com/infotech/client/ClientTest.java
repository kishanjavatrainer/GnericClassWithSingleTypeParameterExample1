package com.infotech.client;

import com.infotech.generic.MyGenericClass;
import com.infotech.model.Employee;


public class ClientTest {

	public static void main(String[] args) {
		
		MyGenericClass<String> class1 = new MyGenericClass<String>("Sean");
		
		String object = class1.getObject();
		System.out.println(object);
		
		System.out.println("-------------------------------------------");
		
		Employee employee = new Employee();
		employee.setId(288333);
		employee.setName("Joya");
		employee.setSalary(70000.00);
		
		MyGenericClass<Employee> class2 = new MyGenericClass<Employee>(employee);
		Employee object2 = class2.getObject();
		
		System.out.println(object2);
	}
}
