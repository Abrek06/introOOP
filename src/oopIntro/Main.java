package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		
		Product product1 = new Product();
		product1.id=1;
		product1.name="Lenovo 14";
		product1.unitPrice=15000;
		product1.detail="16 GB Ram";
		
		Product product2 = new Product();
		product2.id=1;
		product2.name="Lenovo 15";
		product2.unitPrice=16000;
		product2.detail="32 GB Ram";
		
		Product product3 = new Product();
		product3.id=1;
		product3.name="Hp 15";
		product3.unitPrice=10000;
		product3.detail="8 GB Ram";
		
		
		
 		
		Product[] products = {
			
				product1, product2, product3
				
		};
		
			System.out.println("Ürün Adedi: "+products.length);
			System.out.println("**************************");
		
		for (Product product : products) {
			System.out.println("Id        : "+product.id);
			System.out.println("ürünAdý   : "+product.name);
			System.out.println("ÜrünFiyatý: "+product.unitPrice);
			System.out.println("Açýklama  : "+product.detail);
			System.out.println("**************************");
		}
	}

}
