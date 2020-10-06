package com.jnit;

public class Employee {
	private int eid;
	private String ename;
	private int salary;
	public Employee(int eid, String ename, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	public Employee(int eid, int salary) {
		super();
		this.eid = eid;
		this.salary = salary;
	}
	public Employee(int eid) {
		super();
		this.eid = eid;
	}
	public void show() {
		System.out.println(eid+" "+ename+" "+salary);
	}
	
	
	

}
