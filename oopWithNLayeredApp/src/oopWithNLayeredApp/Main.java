package oopWithNLayeredApp;

import java.util.List;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		// UI gibi burasý..
		
		Product firstProduct=new Product(1,"Iphone 11",9000);
		
		Logger[] loggers= {new DatabaseLogger(),new MailLogger(),new FileLogger()};
		
		ProductManager productManager=new ProductManager(new HibernateProductDao(),loggers);
		productManager.add(firstProduct);
		
		
		
	}

}
