package app;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(5, "Libary");
		
		Seller seller = new Seller(2, "Luiz", "luiz@gmail.com", new Date(), 3000.0, obj);
		
		System.out.println(seller);

	}

}
