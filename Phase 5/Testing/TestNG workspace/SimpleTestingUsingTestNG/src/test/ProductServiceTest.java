package test;

import static org.testng.Assert.assertEquals;

import java.time.LocalDate;
import java.util.Map;

import org.testng.annotations.Test;

import com.ProductService;

public class ProductServiceTest {

  @Test
  public void filterProductTest() {
    //throw new RuntimeException("Test not implemented");
	  ProductService ps = new ProductService();
	  	Map<String, Float>	filterProducts	 = ps.filterProduct(1000, 50000);
	  	assertEquals(filterProducts.size(), 4);
  }

  @Test
  public void isExpiriedTest() {
	  ProductService ps = new ProductService();
	  boolean res = ps.isExpiried("Laptop", LocalDate.now());
	  assertEquals(res, true);
	  // throw new RuntimeException("Test not implemented");
  }

  @Test
  public void searchProductTest() {
	  ProductService ps = new ProductService();
	  boolean res =ps.searchProduct("Tv", 55000);
	  assertEquals(res, true);
    //throw new RuntimeException("Test not implemented");
  }
}
