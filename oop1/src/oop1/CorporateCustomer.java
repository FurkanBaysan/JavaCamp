package oop1;

public class CorporateCustomer extends Customer {
	private String companyName;
	private String taxNumber;

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyNumber) {
		this.companyName = companyNumber;
	}

	public String getTaxNumber() {
		return this.taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

}
