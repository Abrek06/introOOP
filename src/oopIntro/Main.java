package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		
		Product product1 = new Product(1,"Lenovo 14",15000,"16 GB Ram");		
		
		Product product2 = new Product(2,"Lenovo 15",16000,"32 GB Ram");
		
		Product product3 = new Product(3,"Hp 15",10000,"8 GB Ram");
		

		Product[] products = {product1, product2, product3};
		System.out.println("********************************************************");
		
			System.out.println("Ürün Adedi  : "+products.length);
			System.out.println("********************************************************");
		
		for (Product product : products) {
			System.out.println("Id          : "+product.getId());
			System.out.println("ürünAdý     : "+product.getName());
			System.out.println("ÜrünFiyatý  : "+product.getUnitPrice());
			System.out.println("Açýklama    : "+product.getDetail());
			System.out.println("********************************************************");
		}
		
		Category category1 = new Category(1,"Bilgisayar");
		
		Category category2 = new Category(2,"Ev/Bahçe");
		
		Category[] categories = {category1,category2};
		
		for (Category category : categories) {
			System.out.println("Kategori Id :"+category.getId());
			System.out.println("kategori Adý:"+category.getName());
			System.out.println("********************************************************");
		}
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
	}
	
		
		

}
