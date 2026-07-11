import java.lang.*;
import java.io.*;
 
abstract class Person
{
	private  String fullName;
	private  String email;
	private  String phone;
 
	public Person()
	{
 
	}
 
	public Person(String fullName,String email)
	{
		this.fullName=fullName;
		this.email=email;
	}
 
	public void setFullName(String fullName)
	{
		this.fullName=fullName;
	}
	public void setEmail(String email)
	 {
	 	this.email=email;
	 }
 
	 public String getFullName()
	 {
	 	return fullName;
	 }
	 public String getEmail()
	 {
	 	return email;
	 }
 
	  abstract void showAll();//
 
 
}