package Problem2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

import Problem2.ProductInfo.SortMethod;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product("Asus", 1000.0, 1));
		list.add(new Product("SAMSUNG - 2", 8000.0, 8));
		list.add(new Product("DELL", 4000.0, 4));
		list.add(new Product("APPLE", 6000.0, 6));
		list.add(new Product("LENOVO", 3000.0, 3));
		list.add(new Product("HP", 5000.0, 5));
		list.add(new Product("MIS",2000.0, 2));
		list.add(new Product("SAMSUNG - 1", 7000.0, 7));

		System.out.println("Unsorted ------------------------------------------------");
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

		
		ProductInfo proInfo=new ProductInfo(); 
		proInfo.sort(list,SortMethod.BYPRICE);

		System.out.println("\nSorted by Price ---------------------------------------");
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		
	 
		
		proInfo.sort(list,SortMethod.BYTITLE);

		System.out.println("\nSorted by TITLE ---------------------------------------");
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		
		

	}

}
