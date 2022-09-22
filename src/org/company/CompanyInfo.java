package org.company;

public class CompanyInfo {
	//method creation
	private void companyName() {
		System.out.println("veera enterprises");
	}
	private void companyId() {
		System.out.println("tn496565");
	}
	private void companyAddress() {
		System.out.println("thuraipakkam");
	}
 public static void main  (String args[]) {
	 // object create 
	 CompanyInfo companyOrg= new CompanyInfo ();
			 companyOrg.companyName();
	 companyOrg.companyId();
	 companyOrg.companyAddress();
 }
}
