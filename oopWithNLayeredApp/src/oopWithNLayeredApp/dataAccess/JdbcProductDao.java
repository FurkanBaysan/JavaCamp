package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
	// Dao => Data Access object
	
	//sadece ve sadece db eriþim kodlarý buraya yazýlýr
	// SQL bilmek gerekir.
	
	//Ayný isimde iki ürün eklenemez =>Bir Ýþ Kuralý bu. Business Domain
	
	public void add(Product product) {
		System.out.println("JDBC ile veritabanýna eklendi");
	}
	
	
}
