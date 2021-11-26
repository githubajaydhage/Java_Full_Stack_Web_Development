package com;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ProductService {

	public boolean searchProduct(String pname,float price) {
		Map<String, Float> productInfo = new HashMap<>();
		productInfo.put("Tv", 85000.00f);
		productInfo.put("Computer", 45000f);
		productInfo.put("Laptop", 120000.50f);
		boolean searchProduct	 = productInfo.containsKey(pname);
		return searchProduct;
	}
	
	
	public boolean isExpiried(String pname, LocalDate localDate) {
		int flag = 0;
		Map<String, LocalDate> productInfo = new HashMap<>();
		productInfo.put("Tv", LocalDate.now());
		productInfo.put("Computer", LocalDate.of(2022, 1, 10));
		productInfo.put("Laptop", LocalDate.of(2021, 8, 10));
		Set<?> ss = productInfo.entrySet();					// converting map to string to retrieve the records one by one 
		Iterator<?> li = ss.iterator();
		while(li.hasNext()) {
				Map.Entry<String, LocalDate> mm= (Map.Entry<String, LocalDate>)li.next(); // type casting for Map.Entry 
					if(mm.getKey().equals(pname)) {
										if(mm.getValue().isBefore(localDate)) {
											flag++;
											break;
										}
					}
		}
		if(flag<=0) {
				return false;
		}else {
			return true;
		}
	}
	
	
	
	public Map<String, Float> filterProduct(float minPrice, float maxPrice) {
		Map<String,Float> filterMap = new HashMap<>();
		Map<String, Float> productInfo = new HashMap<>();
		productInfo.put("Tv", 85000.00f);
		productInfo.put("Computer", 45000f);
		productInfo.put("Laptop", 120000.50f);
		productInfo.put("Mobile", 35000.00f);
		productInfo.put("Data Card", 3500f);
		productInfo.put("Pen Drive", 1000f);
		Set<?> ss = productInfo.entrySet();					// converting map to string to retrieve the records one by one 
		Iterator<?> li = ss.iterator();
		while(li.hasNext()) {
			Map.Entry<String, Float> mm= (Map.Entry<String, Float>)li.next(); // type casting for Map.Entry
				if(mm.getValue() >= minPrice   && mm.getValue() <= maxPrice) {
					filterMap.put(mm.getKey(), mm.getValue());
				//	System.out.println(" Key "+mm.getKey());
			}
		}
		return filterMap;
	}
	
}
