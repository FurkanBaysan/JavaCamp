package oop1;

public class Main {

	public static void main(String[] args) {
		Product firstProduct = new Product(); // getProductById()
		// Setting value
		firstProduct.setName("Delonghi Kahve Makinesi");
		firstProduct.setUnitPrice(7500);
		firstProduct.setDiscount(7);
		firstProduct.setUnitsInStock(3);
		firstProduct.setImageUrl("image1.jpg");

		// Getting value
		// System.out.println(firstProduct.name);

		System.out.println();

		Product secondProduct = new Product();
		secondProduct.setName("Smeg Kahve Makinesi");
		secondProduct.setUnitPrice(6500);
		secondProduct.setDiscount(5);
		secondProduct.setUnitsInStock(5);
		secondProduct.setImageUrl("image2.jpg");

		Product thirdProduct = new Product();
		thirdProduct.setName("Kitchen Aid Kahve Makinesi");
		thirdProduct.setUnitPrice(8500);
		thirdProduct.setDiscount(9);
		thirdProduct.setUnitsInStock(2);
		thirdProduct.setImageUrl("image3.jpg");

		Product[] products = { firstProduct, secondProduct, thirdProduct };

		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");

		System.out.println("\t" + "Inheritance");

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhoneNumber("05321478797");
		individualCustomer.setCustomerNumber("1234");

		individualCustomer.setFirstName("Furkan");
		individualCustomer.setLastName("Baysan");

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhoneNumber("05333333333");
		corporateCustomer.setCustomerNumber("5678");

		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setTaxNumber("111111111");

		Customer[] customers = { individualCustomer, corporateCustomer };// Polymorphic behavior
		for (Customer customer : customers) {
			System.out.println(customer.getCustomerNumber() + " ");
		}

	}

}
