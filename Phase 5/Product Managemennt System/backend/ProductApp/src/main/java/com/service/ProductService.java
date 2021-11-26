package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.dao.ProductDao;

@Service
public class ProductService {

	@Autowired
	ProductDao productDao;
	
	public String storeProductInformation(Product pp) {
								boolean result = productDao.existsById(pp.getPid());
								if(!result) {
									productDao.save(pp);
									return "Record store successfully";
								}else {
									return "Record didn't store ";
								}
	}
	
	public List<Product> getAllProductDetails() {
		return productDao.findAll();
	}
	
	public String deleteProductInfo(int pid) {
		
				if(productDao.existsById(pid)) {
				productDao.deleteById(pid);
				return "Record deleted successfully";
			}else {
				return "Record not present";
			}
	}
	
	public String deleteProductByName(String pname) {
		
		if(productDao.deleteProductByName(pname)>0) {
			return "Record deleted successfully";
		}else {
			return "Record not present";
		}
	}
	
	public String updateProductPrice(Product p) {
		if(productDao.updateProductPrice(p.getPid(), p.getPrice())>0) {
				return"Record updated successfully";
		}else {
			return "Record didn't update";
		}
	}
	
	public List<Product> getFilterProductInfo(float minPrice, float maxPrice) {
		return productDao.getFilterProduct(minPrice, maxPrice);
	}
}
