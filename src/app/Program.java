package app;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(5, "Libary");
		
		Seller seller = new Seller(2, "Luiz", "luiz@gmail.com", new Date(), 3000.0, obj);
		
		SellerDAO sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(seller);

	}

}
