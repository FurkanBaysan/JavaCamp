package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	
	private ProductDao productDao;
	//private List<Logger> loggers;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao,Logger[] loggers) {
		this.productDao=productDao;
		this.loggers=loggers;
	}
	
	public void add(Product product) throws Exception { // response request pattern'i ile uygulayucaz db nesnelerini
		// �� Kurallar� (Business Rules)
		
		if(product.getUnitPrice()<10) {
			throw new Exception("�r�n fiyat� 10 dan k���k olamaz");
			//exception f�rlat�l�rsa uygulama orda kesilir,k�r�l�r, return gibi yani
		}
		
			// Improper use
		//HibernateProductDao productDao=new HibernateProductDao(); // yanl�� kullan�m
		//productDao.add(product);
		
		this.productDao.add(product);
		
		for(Logger logger:this.loggers) {//[db,mail]
			logger.log(product.getName());
		}
		
	}
}
