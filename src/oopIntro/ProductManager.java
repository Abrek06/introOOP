package oopIntro;

public class ProductManager {
	
	//cart sepet demek
	public void addToCart(Product product) {
		System.out.println("Ürün sepete eklendi: " + product.getId());
		System.out.println("Ürün sepete eklendi: " + product.getName());
		System.out.println("Ürün sepete eklendi: " + product.getUnitPrice());
		System.out.println("Ürün sepete eklendi: " + product.getDetail());
		System.out.println("********************************************************");
	}
	
	
	
}
