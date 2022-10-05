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
		// Ýþ Kurallarý (Business Rules)
		
		if(product.getUnitPrice()<10) {
			throw new Exception("Ürün fiyatý 10 dan küçük olamaz");
			//exception fýrlatýlýrsa uygulama orda kesilir,kýrýlýr, return gibi yani
		}
		
			// Improper use
		//HibernateProductDao productDao=new HibernateProductDao(); // yanlýþ kullaným
		//productDao.add(product);
		
		this.productDao.add(product);
		
		for(Logger logger:this.loggers) {//[db,mail]
			logger.log(product.getName());
		}
		
	}
}
