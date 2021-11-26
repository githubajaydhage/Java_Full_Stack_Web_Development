package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Product;
import com.service.ProductService;

@RestController
@RequestMapping("product")  // main path
@CrossOrigin()
public class ProductController {
		
	
	@Autowired
	ProductService productService;
	
	@PostMapping(value = "storeProduct",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeProductInformation(@RequestBody Product pp) {
		return productService.storeProductInformation(pp);
	}
	
	@GetMapping(value = "getAllProducts",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAllProductsInfo() {
		return productService.getAllProductDetails();
	}
	
	@DeleteMapping(value = "deleteProductInfo/{pid}")
	public String deleteProductInfo(@PathVariable("pid") int pid) {
		return productService.deleteProductInfo(pid);
	}

	@DeleteMapping(value = "deleteProductByName/{pname}")
	public String deleteProductByName(@PathVariable("pname") String pname) {
		return productService.deleteProductByName(pname);
	}
	
	@PutMapping(value = "updateProductPrice",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateProductPrice(@RequestBody Product pp) {
		return productService.updateProductPrice(pp);
	}

	@GetMapping(value = "filterProduct/{min}/{max}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getFilterProduct(@PathVariable("min") float minPrice, 
			@PathVariable("max") float maxPrice) {
			return productService.getFilterProductInfo(minPrice, maxPrice);
	}
}
