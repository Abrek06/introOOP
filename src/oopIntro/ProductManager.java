package oopIntro;

public class ProductManager {
	
	//cart sepet demek
	public void addToCart(Product product) {
		System.out.println("�r�n sepete eklendi: " + product.getId());
		System.out.println("�r�n sepete eklendi: " + product.getName());
		System.out.println("�r�n sepete eklendi: " + product.getUnitPrice());
		System.out.println("�r�n sepete eklendi: " + product.getDetail());
		System.out.println("********************************************************");
	}
	
	
	
}
