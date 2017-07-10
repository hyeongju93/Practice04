package com.javaex.problem02;

public class Depart extends Employee {
	private String job;
	
	public Depart(String name, int salary,String job) {
		super(name,salary);
		this.job=job;
	}
	
	public void getInformation() {
        System.out.println("이름:" + super.getName() + "    연봉:" + super.getSalary()+"    부서:"+job);
    }

    //코드작성

}
