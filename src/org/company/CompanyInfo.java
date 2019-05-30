package org.company;

public class CompanyInfo {
	
	public void companyName(String name) {
		System.out.println("Company Name is\t"+name);
	}
	public void companyName(int Id,float Sal) {
		System.out.println("ID\t"+Id+"\tSal\t"+Sal);
	}
	public void companyName(float NetSal,int Serialno,String location) {
		System.out.println("NetSal\t"+NetSal+"\tSerial no\t"+Serialno+"\tLocation\t"+location);
	}
	
	public static void main(String[] args) {
		CompanyInfo c=new CompanyInfo();
		c.companyName("ACL");
		c.companyName(5465, 4612312f);
		c.companyName(5465, 5, "Chennai");
	}

}
