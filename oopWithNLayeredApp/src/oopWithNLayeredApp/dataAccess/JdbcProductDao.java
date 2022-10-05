package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
	// Dao => Data Access object
	
	//sadece ve sadece db eri�im kodlar� buraya yaz�l�r
	// SQL bilmek gerekir.
	
	//Ayn� isimde iki �r�n eklenemez =>Bir �� Kural� bu. Business Domain
	
	public void add(Product product) {
		System.out.println("JDBC ile veritaban�na eklendi");
	}
	
	
}
