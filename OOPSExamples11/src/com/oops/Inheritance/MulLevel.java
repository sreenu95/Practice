package com.oops.Inheritance;

class College
{
	protected String CollegeName;
	protected String CId;
	
	public String getCollegeName() {
		return CollegeName;
	}

	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}

	public String getCId() {
		return CId;
	}

	public void setCId(String cId) {
		CId = cId;
	}

	public void staff()
	{
		System.out.println("working");
	}
}
class Staff extends College
{
	protected int sno=12;
	public void attendance()
	{
		System.out.println("taking attendance");
	}
	
}
class Student1 extends Staff
{
	String sName="malli";
	public void learn()
	{
		System.out.println("learning");
	}
}
public class MulLevel {

	public static void main(String[] args) {
			Student1 s =new Student1();
			s.setCId("123");
			s.setCollegeName("sgdc");
			s.attendance();
			System.out.println(s.sName);
			System.out.println(s.sno);
			System.out.println(s.getCId());
			System.out.println(s.getCollegeName());
			s.learn();
			s.staff();
	}

}
