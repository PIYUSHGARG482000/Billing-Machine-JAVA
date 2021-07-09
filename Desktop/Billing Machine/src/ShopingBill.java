
import java.util.*;
public class ShopingBill {
	public static void main(String[] args) {
		String productName = null;
		int qty = 0;
		double price = 0.0;
		double totalPrice = 0.0;
		double overAllPrice = 0.0;
		char choice = '\0';
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Product> product = new ArrayList<>();
				
		do {	
			System.out.println("Enter Product Details");
			System.out.print("Name : ");
			productName = sc.nextLine();
			System.out.print("Quantity : ");
			qty = sc.nextInt();
			System.out.print("Price (per item) : ");
			price = sc.nextDouble();
			
			//Calculation for Total price
			totalPrice = price * qty;
			overAllPrice += totalPrice;
			product.add(new Product(productName, qty, price, totalPrice));
			System.out.print("Would you like to Enter More Produycts (Y or N): ");
			choice = sc.next().charAt(0);
			sc.nextLine();
		}while(choice == 'Y' || choice == 'y');
				
		System.out.print("\nProduct Name " + "Quantity " + "Price " + "   Total Price\n" );
		for(Product p: product) {
			p.DisplayBill();
			System.out.println();
		}
		System.out.println("\nOverAllPrice : " + overAllPrice);
		
		sc.close();
		
	}

}
class Product {
	//Properties of a Product Class
	private String pname;
	private int quantity;
	private double price;
	private double totalPrice;
	
	//Constructor of a Product class
	public Product(String pname, int quantity, double price, double totalPrice) {
		this.pname = pname;
		this.quantity = quantity;
		this.price = price;
		this.totalPrice = totalPrice;
	}
	
	public void DisplayBill() {
		System.out.format("%-9s %8d %10.2f %10.2f",pname,quantity,price,totalPrice);
	}
}
