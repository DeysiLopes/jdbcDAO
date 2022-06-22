package app;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDAO sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== Test 1: findById seller ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== Test 2: findDepartment ===");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Test 3: findAll ===");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Test 4: seller insert ===");
		Seller newSeller = new Seller(null, "Julio", "julio@gmail.com", new Date(), 4500.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserido!! Novo Id " + newSeller.getId());
		
		System.out.println("\n=== Test 5: seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Olga Bernadette");
		sellerDao.update(seller);
		System.out.println("Update concluído!!");

	}

}
